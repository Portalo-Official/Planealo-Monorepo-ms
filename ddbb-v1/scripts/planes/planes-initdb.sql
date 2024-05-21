-- Tabla de planes
CREATE TABLE planes (
    id BIGSERIAL PRIMARY KEY,
    referencia VARCHAR(150) NOT NULL UNIQUE,
    fecha_creacion TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    fecha_fin TIMESTAMP WITHOUT TIME ZONE NULL,
    ubicacion_latitud DOUBLE PRECISION,
    ubicacion_longitud DOUBLE PRECISION,
    descripcion TEXT,
    modo VARCHAR(50) CHECK (modo IN ('privada', 'publica'))  -- Restricción para asegurarme de introducir estos valores
);

--  Tabla de roles
CREATE TABLE rol (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL  CHECK (modo IN ('administrador', 'invitado', 'propietario')) 
);

-- Tabla de miembros del plan
CREATE TABLE plan_miembros (
    plan_referencia VARCHAR(150) NOT NULL,
    usuario_ref VARCHAR(150) NOT NULL,
    rol_id BIGINT NOT NULL,
    PRIMARY KEY (plan_referencia, usuario_ref),
    FOREIGN KEY (plan_referencia) REFERENCES planes(referencia),
    FOREIGN KEY (rol_id) REFERENCES rol(id)
);

-- Insertar valores en la tabla rol
-- INSERT INTO rol (nombre) VALUES ('administrador'), ('invitado'), ('propietario');
