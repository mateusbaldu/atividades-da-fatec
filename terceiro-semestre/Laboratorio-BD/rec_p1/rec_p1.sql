CREATE DATABASE Loja;

USE Loja;

CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    cpf VARCHAR(100)
);

CREATE TABLE pedidos (
    id INT PRIMARY KEY,
    data DATE NOT NULL,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id) 
);

CREATE TABLE produtos (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);

CREATE TABLE itens_pedido (
    id INT PRIMARY KEY,
    pedido_id INT,
    produto_id INT,
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL, 
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id),
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
); 

start transaction;

INSERT INTO Cliente (nome, email) VALUES
('Mateus', 'mateusficticio@email.com'),
(2, 'Maria', 'mariaficticia@email.com', '987.654.321-00'),
(3, 'Carlos', 'carlosficticio@email.com', '321.654.987-00'),
(4, 'Ana', 'anaficticia@email.com', '654.987.321-00'),
(5, 'Luiz', 'luizaficticio@email.com', '789.123.456-00');

INSERT INTO pedidos (id, data, cliente_id) VALUES
(1, '2025-03-20', 1),
(2, '2025-03-21', 2),
(3, '2025-03-22', 3),
(4, '2025-03-23', 4),
(5, '2025-03-24', 5);

INSERT INTO produtos (id, nome, preco) VALUES
(1, 'Batata', 10.99),
(2, 'Arroz', 25.50),
(3, 'Água', 5.75),
(4, 'Ruffles', 12.00),
(5, 'Manga', 18.20);

INSERT INTO itens_pedido (id, pedido_id, produto_id, quantidade, preco_unitario) VALUES
(1, 1, 1, 2, 10.99),
(2, 1, 3, 1, 5.75),
(3, 2, 2, 3, 25.50),
(4, 3, 4, 1, 12.00),
(5, 4, 5, 4, 18.20);

COMMIT;

SELECT c.id AS cliente_id, c.nome AS cliente_nome,
    COUNT(p.id) AS total_pedidos, 
    SUM(ip.quantidade) AS total_quantidade_produtos, 
    SUM(ip.quantidade * ip.preco_unitario) AS total_valor
FROM clientes c
JOIN pedidos p ON c.id = p.cliente_id
JOIN itens_pedido ip ON p.id = ip.pedido_id
GROUP BY c.id, c.nome
ORDER BY c.id;

SELECT p.id AS produto_id, p.nome AS produto_nome,
    SUM(ip.quantidade) AS total_quantidade, 
    SUM(ip.quantidade * ip.preco_unitario) AS total_valor
FROM produtos p
JOIN itens_pedido ip ON p.id = ip.produto_id
GROUP BY p.id, p.nome
ORDER BY p.id;