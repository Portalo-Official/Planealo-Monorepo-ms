    CREATE TABLE invitaciones (
    invitacion_id BIGSERIAL PRIMARY KEY,
    usuario_ref_emisor VARCHAR(150) NOT NULL,
    usuario_ref_receptor VARCHAR(150) NOT NULL,
    plan_id BIGINT NOT NULL,
    fecha_envio TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    estado VARCHAR(50) NOT NULL CHECK (estado IN ('enviada', 'aceptada', 'rechazada'))  -- Solo acepta 'enviada', 'aceptada', 'rechazada'
);