document.addEventListener("DOMContentLoaded", () => {
    fetchArticulos()
})

function fetchArticulos() {
    fetch('/articulos')
        .then(response => response.json())
        .then(data => {
            const articulosBody = document.getElementById('articulos-body');
            articulosBody.innerHTML = ''
            data.forEach(articulo => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${articulo.codigo}</td>
                    <td>${articulo.descripcion}</td>
                    <td>${articulo.precio}</td>
                    <td>${articulo.rubro.descripcion}</td>
                `
                articulosBody.appendChild(row)
            })
        })
        .catch(error => console.error('Error al obtener los artículos:', error))
}