document.addEventListener("DOMContentLoaded", function () {
    const addItemBtn = document.querySelector("#add-item-btn");
    const searchBox = document.querySelector("#search-box");
    const tableBody = document.querySelector("#item-table-body");

    addItemBtn.addEventListener("click", function () {
        const name = document.querySelector("#item-name").value.trim();
        const description = document.querySelector("#item-description").value.trim();
        const category = document.querySelector("#item-category").value.trim();
        const size = document.querySelector("#item-size").value.trim();
        const color = document.querySelector("#item-color").value.trim();
        const price = document.querySelector("#item-price").value.trim();
        const purchasePrice = document.querySelector("#item-purchase-price").value.trim();
        const purchaseDate = document.querySelector("#item-purchase-date").value.trim();

        if (!id || !name || !description || !category || !size || !color || !price || !purchasePrice || !purchaseDate) {
            alert("Por favor, preencha todos os campos.");
            return;
        }

        const row = document.createElement("tr");
        row.innerHTML = `
            <td>(auto)</td>
            <td>${name}</td>
            <td>${description}</td>
            <td>${category}</td>
            <td>${size}</td>
            <td>${color}</td>
            <td>R$ ${parseFloat(price).toFixed(2)}</td>
            <td>R$ ${parseFloat(purchasePrice).toFixed(2)}</td>
            <td>${purchaseDate}</td>
            <td><button class="remove-btn">Remover</button></td>
        `;
        tableBody.appendChild(row);

        document.querySelectorAll("#item-formulario input, #item-formulario textarea").forEach(input => input.value = "");

        document.querySelector("#table-header").style.display = "table-header-group";
    });

    tableBody.addEventListener("click", function (e) {
        if (e.target.classList.contains("remove-btn")) {
            e.target.closest("tr").remove();
        }
    });

    searchBox.addEventListener("input", debounce(function () {
        const filter = searchBox.value.toLowerCase();
        const rows = tableBody.querySelectorAll("tr");

        rows.forEach(row => {
            const text = row.textContent.toLowerCase();
            row.style.display = text.includes(filter) ? "" : "none";
        });
    }, 300));

    function debounce(func, delay) {
        let timeout;
        return function () {
            clearTimeout(timeout);
            timeout = setTimeout(func, delay);
        };
    }
});
