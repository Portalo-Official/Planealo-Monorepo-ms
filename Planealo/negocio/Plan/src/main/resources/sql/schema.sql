DROP TABLE IF EXISTS plan_miembros CASCADE;
DROP TABLE IF EXISTS planes CASCADE;
DROP TABLE IF EXISTS rol CASCADE;
-- Tabla de planes
CREATE TABLE planes (
    id BIGSERIAL PRIMARY KEY,
    referencia VARCHAR(150) NOT NULL UNIQUE,
    fecha_creacion TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    fecha_fin TIMESTAMP WITHOUT TIME ZONE NULL,
    ubicacion_latitud DOUBLE PRECISION,
    ubicacion_altitud DOUBLE PRECISION,
    descripcion TEXT,
    modo VARCHAR(50) CHECK (modo IN ('privada', 'publica'))  -- Restricción para asegurarme de introducir estos valores
);

--  Tabla de roles
CREATE TABLE rol (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL  CHECK (nombre IN ('ADMINISTRADOR', 'INVITADO', 'PROPIETARIO')) 
);

-- Tabla de miembros del plan
CREATE TABLE plan_miembros (
    plan_referencia VARCHAR(150) NOT NULL,
    usuario_ref VARCHAR(150) NOT NULL,
    rol_id BIGINT NOT NULL,
    PRIMARY KEY (plan_referencia, usuario_ref),
    FOREIGN KEY (plan_referencia) REFERENCES planes(referencia) ON DELETE CASCADE,
    FOREIGN KEY (rol_id) REFERENCES rol(id)
);

-- Insertar valores en la tabla rol
-- INSERT INTO rol (nombre) VALUES ('administrador'), ('invitado'), ('propietario');
