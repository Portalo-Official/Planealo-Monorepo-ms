-- Inserción de roles
INSERT INTO rol (nombre) VALUES ('administrador'), ('invitado'), ('propietario');

-- Inserción de planes
INSERT INTO planes (referencia, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_longitud, descripcion, modo) VALUES
('5c2064da-bf6c', CURRENT_TIMESTAMP, NULL, 40.416775, -3.703790, 'Excursión al campo en Madrid', 'publica'),
('7d3b6b6e-9d1f', CURRENT_TIMESTAMP, NULL, 41.382894, 2.177432, 'Reunión de amigos en Barcelona', 'privada'),
('8a1f3c9d-4f6e', CURRENT_TIMESTAMP, NULL, 37.389092, -5.984459, 'Fiesta sorpresa en Sevilla', 'publica'),
('9c3a7e8b-2d4f', CURRENT_TIMESTAMP, NULL, 39.469907, -0.376288, 'Reunión de trabajo en Valencia', 'privada'),
('4d8e9f7a-1b2c', CURRENT_TIMESTAMP, NULL, 43.263013, -2.934985, 'Evento cultural en Bilbao', 'publica'),
('6e7a5d3b-4c8f', CURRENT_TIMESTAMP, NULL, 36.721274, -4.421399, 'Fiesta en la playa en Málaga', 'privada'),
('2f6d8c9e-7b1a', CURRENT_TIMESTAMP, NULL, 37.774929, -4.727752, 'Cena de gala en Córdoba', 'publica'),
('1e4c3b9a-5d7f', CURRENT_TIMESTAMP, NULL, 39.862831, -4.027323, 'Reunión familiar en Toledo', 'privada'),
('3d5a2b7e-9c8f', CURRENT_TIMESTAMP, NULL, 40.978028, -5.663539, 'Excursión a la montaña en Salamanca', 'publica'),
('8b2c5d4e-7a1f', CURRENT_TIMESTAMP, NULL, 42.878213, -8.544844, 'Fiesta sorpresa para Santi en Santiago de Compostela', 'privada');

-- Inserción de miembros del plan
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
('5c2064da-bf6c', 'M1A2B3C-01', 3), -- Propietario
('5c2064da-bf6c', 'T4D5E6F-02', 2),
('5c2064da-bf6c', 'W7G8H9I-03', 2),

('7d3b6b6e-9d1f', 'M2A3B4C-04', 3), -- Propietario
('7d3b6b6e-9d1f', 'T5D6E7F-05', 2),

('8a1f3c9d-4f6e', 'M3A4B5C-06', 3), -- Propietario
('8a1f3c9d-4f6e', 'T6D7E8F-07', 1),

('9c3a7e8b-2d4f', 'M4A5B6C-08', 3), -- Propietario

('4d8e9f7a-1b2c', 'M5A6B7C-09', 3), -- Propietario
('4d8e9f7a-1b2c', 'T7D8E9F-10', 2),
('4d8e9f7a-1b2c', 'W8G9H0I-11', 1),

('6e7a5d3b-4c8f', 'M6A7B8C-12', 3), -- Propietario
('6e7a5d3b-4c8f', 'T8D9E0F-13', 2),

('2f6d8c9e-7b1a', 'M7A8B9C-14', 3), -- Propietario

('1e4c3b9a-5d7f', 'M8A9B0C-15', 3), -- Propietario
('1e4c3b9a-5d7f', 'T9E0F1G-16', 2),

('3d5a2b7e-9c8f', 'M9B0A1C-17', 3), -- Propietario
('3d5a2b7e-9c8f', 'T0F1E2G-18', 2),

('8b2c5d4e-7a1f', 'MA1B2C3-19', 3), -- Propietario
('8b2c5d4e-7a1f', 'T2D3E4F-20', 2);
