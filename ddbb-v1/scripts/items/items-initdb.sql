-- Tabla de categorías de items
CREATE TABLE categorias (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL
);

-- Tabla de items
CREATE TABLE items (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL,
    categoria_id BIGINT,
    plan_id BIGINT NOT NULL,  -- Referencia a un plan
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

-- Tabla que asocia items a usuarios
CREATE TABLE asignacion_items (
    id BIGSERIAL PRIMARY KEY,
    item_id BIGINT NOT NULL,
    referencia_usuario  VARCHAR(150) NOT NULL,  -- Referencia a usuario 
    tarea_tachada BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (item_id) REFERENCES items(id)
);

-- Insertar categorias por defecto
INSERT INTO categorias (nombre) VALUES
('comida'),
('bebida'),
('ropa y accesorios'),
('entretenimiento'),
('equipamiento'),
('otros');