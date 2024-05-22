-- Inserción de roles
INSERT INTO rol (nombre) VALUES ('ADMINISTRADOR'), ('INVITADO'), ('PROPIETARIO');

-- Inserción de planes
INSERT INTO planes (referencia, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('5c2064da-bf6c', CURRENT_TIMESTAMP, NULL, 40.416775, -3.703790, 'Excursión al campo en Madrid', 'PUBLICA'),
('7d3b6b6e-9d1f', CURRENT_TIMESTAMP, NULL, 41.382894, 2.177432, 'Reunión de amigos en Barcelona', 'PRIVADA'),
('8a1f3c9d-4f6e', CURRENT_TIMESTAMP, NULL, 37.389092, -5.984459, 'Fiesta sorpresa en Sevilla', 'PUBLICA'),
('9c3a7e8b-2d4f', CURRENT_TIMESTAMP, NULL, 39.469907, -0.376288, 'Reunión de trabajo en Valencia', 'PRIVADA'),
('4d8e9f7a-1b2c', CURRENT_TIMESTAMP, NULL, 43.263013, -2.934985, 'Evento cultural en Bilbao', 'PUBLICA'),
('6e7a5d3b-4c8f', CURRENT_TIMESTAMP, NULL, 36.721274, -4.421399, 'Fiesta en la playa en Málaga', 'PRIVADA'),
('2f6d8c9e-7b1a', CURRENT_TIMESTAMP, NULL, 37.774929, -4.727752, 'Cena de gala en Córdoba', 'PUBLICA'),
('1e4c3b9a-5d7f', CURRENT_TIMESTAMP, NULL, 39.862831, -4.027323, 'Reunión familiar en Toledo', 'PRIVADA'),
('3d5a2b7e-9c8f', CURRENT_TIMESTAMP, NULL, 40.978028, -5.663539, 'Excursión a la montaña en Salamanca', 'PUBLICA'),
('8b2c5d4e-7a1f', CURRENT_TIMESTAMP, NULL, 42.878213, -8.544844, 'Fiesta sorpresa para Santi en Santiago de Compostela', 'PRIVADA');


