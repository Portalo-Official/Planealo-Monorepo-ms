-- Inserción de roles
INSERT INTO rol (nombre) VALUES ('ADMINISTRADOR'), ('INVITADO'), ('PROPIETARIO');

-- Inserción de planes
INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('5c2064da-bf6c', 'Excursión al campo', CURRENT_TIMESTAMP, NULL, 40.416775, -3.703790, 'Excursión al campo en Madrid', 'PUBLICA'),
('7d3b6b6e-9d1f', 'Reunión de amigos', CURRENT_TIMESTAMP, NULL, 41.382894, 2.177432, 'Reunión de amigos en Barcelona', 'PRIVADA'),
('8a1f3c9d-4f6e', 'Fiesta sorpresa', CURRENT_TIMESTAMP, NULL, 37.389092, -5.984459, 'Fiesta sorpresa en Sevilla', 'PUBLICA'),
('9c3a7e8b-2d4f', 'Reunión de trabajo', CURRENT_TIMESTAMP, NULL, 39.469907, -0.376288, 'Reunión de trabajo en Valencia', 'PRIVADA'),
('4d8e9f7a-1b2c', 'Evento cultural', CURRENT_TIMESTAMP, NULL, 43.263013, -2.934985, 'Evento cultural en Bilbao', 'PUBLICA'),
('6e7a5d3b-4c8f', 'Fiesta en la playa', CURRENT_TIMESTAMP, NULL, 36.721274, -4.421399, 'Fiesta en la playa en Málaga', 'PRIVADA'),
('2f6d8c9e-7b1a', 'Cena de gala', CURRENT_TIMESTAMP, NULL, 37.774929, -4.727752, 'Cena de gala en Córdoba', 'PUBLICA'),
('1e4c3b9a-5d7f', 'Reunión familiar', CURRENT_TIMESTAMP, NULL, 39.862831, -4.027323, 'Reunión familiar en Toledo', 'PRIVADA'),
('3d5a2b7e-9c8f', 'Excursión a la montaña', CURRENT_TIMESTAMP, NULL, 40.978028, -5.663539, 'Excursión a la montaña en Salamanca', 'PUBLICA'),
('8b2c5d4e-7a1f', 'Fiesta sorpresa para Santi', CURRENT_TIMESTAMP, NULL, 42.878213, -8.544844, 'Fiesta sorpresa para Santi en Santiago de Compostela', 'PRIVADA');

-- Inserción de 25 planes adicionales con descripciones y ubicaciones reales en España
INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'Visita al Parque Güell', CURRENT_TIMESTAMP, NULL, 41.414495, 2.152694, 'Visita guiada al famoso Parque Güell en Barcelona', 'PUBLICA'),
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'Ruta del Vino en La Rioja', CURRENT_TIMESTAMP, NULL, 42.465050, -2.448397, 'Exploración de bodegas y viñedos en La Rioja', 'PRIVADA'),
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'Caminata por el Camino de Santiago', CURRENT_TIMESTAMP, NULL, 42.878213, -8.544844, 'Caminata grupal por el tramo final del Camino de Santiago', 'PUBLICA'),
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'Concierto en el Palau de la Música', CURRENT_TIMESTAMP, NULL, 41.387012, 2.175984, 'Asistencia a un concierto en el Palau de la Música en Barcelona', 'PRIVADA'),
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'Tour Gastronómico en San Sebastián', CURRENT_TIMESTAMP, NULL, 43.321065, -1.986933, 'Tour de pintxos y platos tradicionales en San Sebastián', 'PUBLICA'),
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'Excursión a la Alhambra', CURRENT_TIMESTAMP, NULL, 37.176077, -3.588141, 'Visita a la histórica Alhambra en Granada', 'PRIVADA'),
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'Jornada de Surf en Tarifa', CURRENT_TIMESTAMP, NULL, 36.013169, -5.605284, 'Día completo de surf en las playas de Tarifa', 'PUBLICA'),
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'Fiesta de la Tomatina', CURRENT_TIMESTAMP, NULL, 39.153999, -0.434056, 'Participación en la famosa Fiesta de la Tomatina en Buñol', 'PRIVADA'),
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'Visita al Museo del Prado', CURRENT_TIMESTAMP, NULL, 40.413781, -3.692127, 'Tour guiado por el Museo del Prado en Madrid', 'PUBLICA'),
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'Cata de Quesos en Asturias', CURRENT_TIMESTAMP, NULL, 43.362343, -5.843998, 'Cata de quesos asturianos en una granja local', 'PRIVADA'),
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'Senderismo en los Picos de Europa', CURRENT_TIMESTAMP, NULL, 43.187612, -4.820002, 'Ruta de senderismo por los Picos de Europa', 'PUBLICA'),
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'Ruta de los Castillos en Castilla y León', CURRENT_TIMESTAMP, NULL, 41.652251, -4.724532, 'Visita a varios castillos históricos en Castilla y León', 'PRIVADA'),
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'Paseo en Globo en Segovia', CURRENT_TIMESTAMP, NULL, 40.942906, -4.108805, 'Paseo en globo aerostático sobre Segovia', 'PUBLICA'),
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'Festival de Flamenco en Sevilla', CURRENT_TIMESTAMP, NULL, 37.389092, -5.984459, 'Asistencia a un festival de flamenco en Sevilla', 'PRIVADA'),
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'Día de Playa en la Costa Brava', CURRENT_TIMESTAMP, NULL, 41.743928, 3.028282, 'Día completo de actividades en la playa en la Costa Brava', 'PUBLICA'),
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'Visita al Alcázar de Toledo', CURRENT_TIMESTAMP, NULL, 39.862831, -4.027323, 'Tour por el Alcázar de Toledo', 'PRIVADA'),
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'Excursión a la Sierra de Gredos', CURRENT_TIMESTAMP, NULL, 40.353760, -5.127401, 'Excursión a la Sierra de Gredos en Ávila', 'PUBLICA'),
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'Jornada de Esquí en Sierra Nevada', CURRENT_TIMESTAMP, NULL, 37.092370, -3.397630, 'Día completo de esquí en Sierra Nevada', 'PRIVADA'),
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'Tour en Bici por Valencia', CURRENT_TIMESTAMP, NULL, 39.469907, -0.376288, 'Tour guiado en bicicleta por Valencia', 'PUBLICA'),
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'Visita a la Mezquita de Córdoba', CURRENT_TIMESTAMP, NULL, 37.879151, -4.779383, 'Visita guiada a la Mezquita-Catedral de Córdoba', 'PRIVADA'),
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'Ruta de Tapas en Madrid', CURRENT_TIMESTAMP, NULL, 40.416775, -3.703790, 'Ruta de tapas por el centro de Madrid', 'PUBLICA'),
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'Noche de Estrellas en Tenerife', CURRENT_TIMESTAMP, NULL, 28.291564, -16.629130, 'Observación de estrellas en el Teide, Tenerife', 'PRIVADA'),
('8f5d6e7a-8b9c-012d-e3f4-4567890123ss', 'Festival de Cine en San Sebastián', CURRENT_TIMESTAMP, NULL, 43.321065, -1.986933, 'Asistencia al Festival Internacional de Cine en San Sebastián', 'PRIVADA'),
('9f6d7e8a-9b0c-123d-e4f5-5678901234tt', 'Jornada de Golf en Marbella', CURRENT_TIMESTAMP, NULL, 36.510068, -4.882447, 'Día completo de golf en un campo de Marbella', 'PUBLICA');


-- Inserción de miembros del plan
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
('5c2064da-bf6c', 'M1A2B3C-01', 3), -- Propietario
('5c2064da-bf6c', 'T4D5E6F-02', 2),
('5c2064da-bf6c', 'W7G8H9I-03', 1),

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
('3d5a2b7e-9c8f', 'T0F1E2G-18', 1),

('8b2c5d4e-7a1f', 'MA1B2C3-19', 3), -- Propietario
('8b2c5d4e-7a1f', 'T2D3E4F-20', 2);

-- Inserción de miembros del plan para los nuevos planes
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
-- Plan '1f2d3e4a-5b6c-789d-e0f1-1234567890ab'
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'M1A2B3C-01', 1), -- Rol 1
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'T4D5E6F-02', 2),
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'W7G8H9I-03', 2),
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'U1V2W3X-04', 3),
('1f2d3e4a-5b6c-789d-e0f1-1234567890ab', 'Y4Z5A6B-05', 1),

-- Plan '2f3d4e5a-6b7c-890d-e1f2-2345678901bc'
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'M2A3B4C-04', 1), -- Rol 1
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'T5D6E7F-05', 2),
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'W8G9H0I-06', 3),
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'U2V3W4X-07', 2),
('2f3d4e5a-6b7c-890d-e1f2-2345678901bc', 'Y5Z6A7B-08', 1),

-- Plan '3f4d5e6a-7b8c-901d-e2f3-3456789012cd'
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'M3A4B5C-06', 1), -- Rol 1
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'T6D7E8F-07', 2),
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'W9G0H1I-08', 3),
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'U3V4W5X-09', 2),
('3f4d5e6a-7b8c-901d-e2f3-3456789012cd', 'Y6Z7A8B-10', 1),

-- Plan '4f5d6e7a-8b9c-012d-e3f4-4567890123de'
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'M4A5B6C-08', 1), -- Rol 1
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'T7D8E9F-09', 2),
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'W0G1H2I-10', 3),
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'U4V5W6X-11', 2),
('4f5d6e7a-8b9c-012d-e3f4-4567890123de', 'Y7Z8A9B-12', 1),

-- Plan '5f6d7e8a-9b0c-123d-e4f5-5678901234ef'
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'M5A6B7C-09', 1), -- Rol 1
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'T8D9E0F-10', 2),
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'W1G2H3I-11', 3),
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'U5V6W7X-12', 2),
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'Y8Z9A0B-13', 1),
('5f6d7e8a-9b0c-123d-e4f5-5678901234ef', 'V1W2X3Y-14', 2),

-- Plan '6f7d8e9a-0b1c-234d-e5f6-6789012345fa'
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'M6A7B8C-12', 1), -- Rol 1
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'T9E0F1G-13', 2),
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'W2G3H4I-14', 3),
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'U6V7W8X-15', 2),
('6f7d8e9a-0b1c-234d-e5f6-6789012345fa', 'Y9Z0A1B-16', 1),

-- Plan '7f8d9e0a-1b2c-345d-e6f7-7890123456fb'
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'M7A8B9C-14', 1), -- Rol 1
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'T0F1E2G-15', 2),
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'W3G4H5I-16', 3),
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'U7V8W9X-17', 2),
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'Y0Z1A2B-18', 1),
('7f8d9e0a-1b2c-345d-e6f7-7890123456fb', 'V2W3X4Y-19', 2),

-- Plan '8f9d0e1a-2b3c-456d-e7f8-8901234567fc'
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'M8A9B0C-15', 1), -- Rol 1
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'T1E2F3G-16', 2),
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'W4G5H6I-17', 3),
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'U8V9W0X-18', 2),
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'Y1Z2A3B-19', 1),
('8f9d0e1a-2b3c-456d-e7f8-8901234567fc', 'V3W4X5Y-20', 2),

-- Plan '9f0d1e2a-3b4c-567d-e8f9-9012345678fd'
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'M9B0A1C-17', 1), -- Rol 1
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'T2F3E4G-18', 2),
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'W5G6H7I-19', 3),
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'U9V0W1X-20', 2),
('9f0d1e2a-3b4c-567d-e8f9-9012345678fd', 'Y2Z3A4B-21', 1),

-- Plan 'af1d2e3a-4b5c-678d-e9f0-0123456789fe'
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'MA1B2C3-19', 1), -- Rol 1
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'T3F4E5G-20', 2),
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'W6G7H8I-21', 3),
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'U0V1W2X-22', 2),
('af1d2e3a-4b5c-678d-e9f0-0123456789fe', 'Y3Z4A5B-23', 1),

-- Plan 'bf2d3e4a-5b6c-789d-e0f1-1234567890ff'
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'M1A2B3C-01', 1), -- Rol 1
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'T4D5E6F-02', 2),
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'W7G8H9I-03', 3),
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'U1V2W3X-04', 2),
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'Y4Z5A6B-05', 1),
('bf2d3e4a-5b6c-789d-e0f1-1234567890ff', 'V1W2X3Y-06', 2),

-- Plan 'cf3d4e5a-6b7c-890d-e1f2-2345678901gg'
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'M2A3B4C-04', 1), -- Rol 1
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'T5D6E7F-05', 2),
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'W8G9H0I-06', 3),
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'U2V3W4X-07', 2),
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'Y5Z6A7B-08', 1),
('cf3d4e5a-6b7c-890d-e1f2-2345678901gg', 'V2W3X4Y-09', 2),

-- Plan 'df4d5e6a-7b8c-901d-e2f3-3456789012hh'
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'M3A4B5C-06', 1), -- Rol 1
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'T6D7E8F-07', 2),
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'W9G0H1I-08', 3),
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'U3V4W5X-09', 2),
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'Y6Z7A8B-10', 1),
('df4d5e6a-7b8c-901d-e2f3-3456789012hh', 'V3W4X5Y-11', 2),

-- Plan 'ef5d6e7a-8b9c-012d-e3f4-4567890123ii'
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'M4A5B6C-08', 1), -- Rol 1
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'T7D8E9F-09', 2),
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'W0G1H2I-10', 1),
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'U4V5W6X-11', 2),
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'Y7Z8A9B-12', 3),
('ef5d6e7a-8b9c-012d-e3f4-4567890123ii', 'V4W5X6Y-13', 2),

-- Plan 'ff6d7e8a-9b0c-123d-e4f5-5678901234jj'
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'M5A6B7C-09', 1), -- Rol 1
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'T8D9E0F-10', 2),
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'W1G2H3I-11', 1),
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'U5V6W7X-12', 2),
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'Y8Z9A0B-13', 3),
('ff6d7e8a-9b0c-123d-e4f5-5678901234jj', 'V5W6X7Y-14', 2),

-- Plan '0f7d8e9a-0b1c-234d-e5f6-6789012345kk'
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'M6A7B8C-12', 1), -- Rol 1
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'T9E0F1G-13', 2),
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'W2G3H4I-14', 1),
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'U6V7W8X-15', 2),
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'Y9Z0A1B-16', 3),
('0f7d8e9a-0b1c-234d-e5f6-6789012345kk', 'V6W7X8Y-17', 2),

-- Plan '1f8d9e0a-1b2c-345d-e6f7-7890123456ll'
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'M7A8B9C-14', 1), -- Rol 1
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'T0F1E2G-15', 2),
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'W3G4H5I-16', 1),
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'U7V8W9X-17', 2),
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'Y0Z1A2B-18', 3),
('1f8d9e0a-1b2c-345d-e6f7-7890123456ll', 'V7W8X9Y-19', 2),

-- Plan '2f9d0e1a-2b3c-456d-e7f8-8901234567mm'
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'M8A9B0C-15', 1), -- Rol 1
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'T1E2F3G-16', 2),
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'W4G5H6I-17', 3),
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'U8V9W0X-18', 2),
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'Y1Z2A3B-19', 1),
('2f9d0e1a-2b3c-456d-e7f8-8901234567mm', 'V8W9X0Y-20', 2),

-- Plan '3f0d1e2a-3b4c-567d-e8f9-9012345678nn'
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'M9B0A1C-17', 1), -- Rol 1
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'T2F3E4G-18', 2),
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'W5G6H7I-19', 3),
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'U9V0W1X-20', 2),
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'Y2Z3A4B-21', 1),
('3f0d1e2a-3b4c-567d-e8f9-9012345678nn', 'V9W0X1Y-22', 2),

-- Plan '4f1d2e3a-4b5c-678d-e9f0-0123456789oo'
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'MA1B2C3-19', 1), -- Rol 1
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'T3F4E5G-20', 2),
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'W6G7H8I-21', 3),
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'U0V1W2X-22', 2),
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'Y3Z4A5B-23', 1),
('4f1d2e3a-4b5c-678d-e9f0-0123456789oo', 'V0W1X2Y-24', 2),

-- Plan '5f2d3e4a-5b6c-789d-e0f1-1234567890pp'
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'M1A2B3C-01', 1), -- Rol 1
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'T4D5E6F-02', 2),
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'W7G8H9I-03', 3),
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'U1V2W3X-04', 2),
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'Y4Z5A6B-05', 1),
('5f2d3e4a-5b6c-789d-e0f1-1234567890pp', 'V1W2X3Y-06', 2),

-- Plan '6f3d4e5a-6b7c-890d-e1f2-2345678901qq'
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'M2A3B4C-04', 1), -- Rol 1
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'T5D6E7F-05', 2),
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'W8G9H0I-06', 3),
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'U2V3W4X-07', 2),
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'Y5Z6A7B-08', 1),
('6f3d4e5a-6b7c-890d-e1f2-2345678901qq', 'V2W3X4Y-09', 2),

-- 8f5d6e7a-8b9c-012d-e3f4-4567890123ss
('8f5d6e7a-8b9c-012d-e3f4-4567890123ss', 'M1B2C3D-21', 3), -- Adrian como Propietario
('8f5d6e7a-8b9c-012d-e3f4-4567890123ss', 'T4E5F6G-22', 2), -- Bernardo como Invitado
('8f5d6e7a-8b9c-012d-e3f4-4567890123ss', 'W7H8I9J-23', 2), -- Carmen como Invitado

-- Miembros para el plan "Jornada de Golf en Marbella"
('9f6d7e8a-9b0c-123d-e4f5-5678901234tt', 'M2C3D4E-24', 3), -- Daniela como Propietario
('9f6d7e8a-9b0c-123d-e4f5-5678901234tt', 'T5F6G7H-25', 2), -- Esteban como Invitado
('9f6d7e8a-9b0c-123d-e4f5-5678901234tt', 'M3D4E5F-26', 1); -- Felipe como Invitado

-- Inserción de nuevos planes con fecha_fin distinta de null
INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'Conferencia Internacional de Tecnología', CURRENT_TIMESTAMP, '2024-05-30 10:00:00', 40.730610, -73.935242, 'Asistencia a una conferencia de tecnología en Nueva York', 'PUBLICA'),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'Torneo de Tenis en Wimbledon', CURRENT_TIMESTAMP, '2024-05-30 17:00:00', 51.434444, -0.214167, 'Torneo de tenis en Wimbledon, Londres', 'PRIVADA'),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'Maratón en Berlín', CURRENT_TIMESTAMP, '2024-06-06 08:00:00', 52.520008, 13.404954, 'Participación en la maratón de Berlín', 'PUBLICA'),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'Feria de Ciencia en Tokio', CURRENT_TIMESTAMP, '2024-06-07 09:00:00', 35.689487, 139.691711, 'Visita a la feria de ciencia en Tokio', 'PRIVADA'),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'Exposición de Arte en París', CURRENT_TIMESTAMP, '2024-06-08 15:00:00', 48.856613, 2.352222, 'Exposición de arte contemporáneo en París', 'PUBLICA'),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'Concierto de Rock en Buenos Aires', CURRENT_TIMESTAMP, '2024-06-09 20:00:00', -34.603722, -58.381592, 'Concierto de rock en Buenos Aires', 'PRIVADA'),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'Festival de Jazz en Nueva Orleans', CURRENT_TIMESTAMP, '2024-06-10 18:00:00', 29.951065, -90.071533, 'Festival de jazz en Nueva Orleans', 'PUBLICA'),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'Evento de Startups en Silicon Valley', CURRENT_TIMESTAMP, '2024-06-11 14:00:00', 37.387474, -122.057543, 'Evento para emprendedores y startups en Silicon Valley', 'PRIVADA'),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'Festival de Cine en Cannes', CURRENT_TIMESTAMP, '2024-06-12 11:00:00', 43.552849, 7.017369, 'Asistencia al Festival de Cine en Cannes', 'PUBLICA'),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'Encuentro de Bloggers en Ámsterdam', CURRENT_TIMESTAMP, '2024-06-13 16:00:00', 52.367573, 4.904139, 'Encuentro de bloggers en Ámsterdam', 'PRIVADA');

-- Inserción de miembros del plan
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
-- Miembros para el plan "Conferencia Internacional de Tecnología"
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'M1A2B3C-01', 3), -- Propietario
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'T4D5E6F-02', 2),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'W7G8H9I-03', 2),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'M2A3B4C-04', 1),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'T5D6E7F-05', 1),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'M3A4B5C-06', 1),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'T6D7E8F-07', 1),
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3g4h5i6j', 'M4A5B6C-08', 1),

-- Miembros para el plan "Torneo de Tenis en Wimbledon"
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'M1A2B3C-01', 3), -- Propietario
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'M5A6B7C-09', 2),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'T7D8E9F-10', 2),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'W8G9H0I-11', 1),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'M6A7B8C-12', 1),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'T8D9E0F-13', 1),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'M7A8B9C-14', 1),
('2b3c4d5e-6f7a-8b9c-0d1e-2f3g4h5i6j7k', 'T9E0F1G-16', 1),

-- Miembros para el plan "Maratón en Berlín"
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'M1A2B3C-01', 3), -- Propietario
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'M9B0A1C-17', 2),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'T0F1E2G-18', 2),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'W1G2H3I-19', 1),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'M8A9B0C-20', 1),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'T1E2F3G-21', 1),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'M9C0A1B-22', 1),
('3c4d5e6f-7a8b-9c0d-1e2f-3g4h5i6j7k8l', 'T2D3E4F-23', 1),

-- Miembros para el plan "Feria de Ciencia en Tokio"
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'M1A2B3C-01', 3), -- Propietario
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'M3A2B1C-24', 2),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'T5E4F3G-25', 2),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'W7I6H5G-26', 1),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'M4A3B2C-27', 1),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'T7G6F5E-28', 1),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'M5C4B3A-29', 1),
('4d5e6f7a-8b9c-0d1e-2f3g-4h5i6j7k8l9m', 'T9E8F7G-30', 1),

-- Miembros para el plan "Exposición de Arte en París"
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'M1A2B3C-01', 3), -- Propietario
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'M6B5A4C-31', 2),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'T1F0E9G-32', 2),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'W2H1I0J-33', 1),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'M7A6B5C-34', 1),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'T3E2F1G-35', 1),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'M8C7B6A-36', 1),
('5e6f7a8b-9c0d-1e2f-3g4h-5i6j7k8l9m0n', 'T4D3E2F-37', 1),

-- Miembros para el plan "Concierto de Rock en Buenos Aires"
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M1A2B3C-01', 3), -- Propietario
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M9B8A7C-38', 2),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'T5E4F3G-39', 2),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'W8G7H6I-40', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M0A9B8C-41', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'T6F5E4G-42', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M1C0A9B-43', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'T7E6F5G-44', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M2B1A0C-45', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'T8D7E6F-46', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'M3A2B1C-47', 1),
('6f7a8b9c-0d1e-2f3g-4h5i-6j7k8l9m0n1o', 'T9C8D7E-48', 1),

-- Miembros para el plan "Festival de Jazz en Nueva Orleans"
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'M1A2B3C-01', 3), -- Propietario
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'M4A3B2C-49', 2),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'T1E0F9G-50', 2),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'W2I1H0J-51', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'M5A4B3C-52', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'T3G2F1E-53', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'M6B5C4A-54', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'T4D3F2E-55', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'M7C6B5A-56', 1),
('7a8b9c0d-1e2f-3g4h-5i6j-7k8l9m0n1o2p', 'T5E4D3F-57', 1),

-- Miembros para el plan "Evento de Startups en Silicon Valley"
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M1A2B3C-01', 3), -- Propietario
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M8A7B6C-58', 2),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'T9E8D7F-59', 2),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'W3H2I1J-60', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M0B9A8C-61', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'T6G5F4E-62', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M1D0C9B-63', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'T7E6F5G-64', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M2C1B0A-65', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'T8F7E6D-66', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'M3B2A1C-67', 1),
('8b9c0d1e-2f3g-4h5i-6j7k-8l9m0n1o2p3q', 'T9D8C7E-68', 1),

-- Miembros para el plan "Festival de Cine en Cannes"
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M1A2B3C-01', 3), -- Propietario
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M4A3B2C-69', 2),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'T5E4F3G-70', 2),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'W6I5H4J-71', 2),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M5C4B3A-72', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'T7G6F5E-73', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M6B5A4C-74', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'T8F7D6E-75', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M7C6A5B-76', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'T9E8F7G-77', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M8B7C6A-78', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'T0G9F8E-79', 1),
('9c0d1e2f-3g4h-5i6j-7k8l-9m0n1o2p3q4r', 'M9A8B7C-80', 1),

-- Miembros para el plan "Encuentro de Bloggers en Ámsterdam"
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M1A2B3C-01', 3), -- Propietario
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M0A9B8C-81', 2),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T1F0E9G-82', 2),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'W2H1I0J-83', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M1C0A9B-84', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T3E2F1G-85', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M2B1A0C-86', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T4D3E2F-87', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M3A2B1C-88', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T5C4D3E-89', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M4B3A2C-90', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T6E5F4G-91', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M5C4A3B-92', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T7D6E5F-93', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'M6A5B4C-94', 1),
('0d1e2f3g-4h5i-6j7k-8l9m-0n1o2p3q4r5s', 'T8F7E6G-95', 1);

-- Inserción de planes con fecha de fin y descripciones más detalladas
INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'Conferencia de Tecnología', CURRENT_TIMESTAMP, '2024-06-10 00:00:00', 40.416775, -3.703790, 'Únete a nosotros en la Conferencia de Tecnología, donde exploraremos las últimas tendencias e innovaciones en el mundo de la tecnología. Disfruta de ponencias inspiradoras y networking con líderes de la industria.', 'PUBLICA'),
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'Seminario de Marketing', CURRENT_TIMESTAMP, '2024-06-15 00:00:00', 41.382894, 2.177432, 'Participa en nuestro Seminario de Marketing y descubre estrategias avanzadas para impulsar tu negocio en el entorno digital. Conoce a expertos del sector y comparte experiencias enriquecedoras.', 'PRIVADA'),
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'Taller de Fotografía', CURRENT_TIMESTAMP, '2024-06-20 00:00:00', 37.389092, -5.984459, 'Apúntate a nuestro Taller de Fotografía y aprende a capturar momentos inolvidables con técnicas profesionales. Este taller está diseñado para todos los niveles, desde principiantes hasta avanzados.', 'PUBLICA'),
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'Evento de Networking', CURRENT_TIMESTAMP, '2024-06-25 00:00:00', 39.469907, -0.376288, 'Asiste a nuestro Evento de Networking y expande tu red profesional. Conecta con personas afines y encuentra nuevas oportunidades de colaboración en un ambiente relajado y amigable.', 'PRIVADA'),
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'Encuentro de Emprendedores', CURRENT_TIMESTAMP, '2024-06-30 00:00:00', 43.263013, -2.934985, 'El Encuentro de Emprendedores es el lugar perfecto para inspirarte y aprender de otros emprendedores. Comparte tus ideas y proyectos, y recibe feedback valioso de la comunidad.', 'PUBLICA'),
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'Congreso de Salud', CURRENT_TIMESTAMP, '2024-07-05 00:00:00', 36.721274, -4.421399, 'Participa en nuestro Congreso de Salud y bienestar, donde abordaremos temas clave para mantener una vida saludable. Escucha a expertos en salud y descubre las últimas investigaciones y tratamientos.', 'PRIVADA'),
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'Foro de Educación', CURRENT_TIMESTAMP, '2024-07-10 00:00:00', 37.774929, -4.727752, 'Únete a nuestro Foro de Educación y contribuye a la discusión sobre el futuro de la enseñanza. Conoce a educadores apasionados y comparte tus ideas para mejorar la educación.', 'PUBLICA'),
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'Festival de Cine', CURRENT_TIMESTAMP, '2024-07-15 00:00:00', 39.862831, -4.027323, 'Disfruta del mejor cine independiente en nuestro Festival de Cine. Proyecciones exclusivas, charlas con directores y una experiencia cinematográfica única te esperan.', 'PRIVADA'),
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'Expo de Arte', CURRENT_TIMESTAMP, '2024-07-20 00:00:00', 40.978028, -5.663539, 'La Expo de Arte es una celebración de la creatividad y la expresión artística. Ven y admira obras de artistas emergentes y consagrados en un ambiente inspirador.', 'PUBLICA'),
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'Conferencia de Negocios', CURRENT_TIMESTAMP, '2024-07-25 00:00:00', 42.878213, -8.544844, 'La Conferencia de Negocios es tu oportunidad para aprender de los mejores en el mundo empresarial. Estrategias, liderazgo y mucho más en un evento que no puedes perderte.', 'PRIVADA'),
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'Taller de Desarrollo Web', CURRENT_TIMESTAMP, '2024-07-30 00:00:00', 41.387917, 2.169918, 'Inscríbete en nuestro Taller de Desarrollo Web y adquiere habilidades prácticas para construir sitios web modernos y funcionales. Ideal para todos los niveles de experiencia.', 'PUBLICA'),
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'Hackathon de IA', CURRENT_TIMESTAMP, '2024-08-05 00:00:00', 39.46975, -0.376256, 'Participa en nuestro Hackathon de IA y colabora con otros desarrolladores para crear soluciones innovadoras en inteligencia artificial. Un evento lleno de retos y aprendizaje.', 'PRIVADA');

-- Inserción de miembros del plan
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
-- Miembros para el plan "Conferencia de Tecnología"
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'M1A2B3C-01', 3), -- Propietario
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'T4D5E6F-02', 2),
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'W7G8H9I-03', 1),
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'M2A3B4C-04', 1),
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'T5D6E7F-05', 1),
('1a2b3c4d-5e6f-7g8h-9i0j-1k2l3m4n5o6p', 'M3A4B5C-06', 1),

-- Miembros para el plan "Seminario de Marketing"
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'T4D5E6F-02', 3), -- Propietario
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'M1A2B3C-01', 2),
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'W7G8H9I-03', 2),
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'M2A3B4C-04', 2),
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'T5D6E7F-05', 2),
('2b3c4d5e-6f7g-8h9i-0j1k-2l3m4n5o6p7q', 'M3A4B5C-06', 2),

-- Miembros para el plan "Taller de Fotografía"
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'W7G8H9I-03', 3), -- Propietario
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'M1A2B3C-01', 2),
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'T4D5E6F-02', 2),
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'M2A3B4C-04', 2),
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'T5D6E7F-05', 2),
('3c4d5e6f-7g8h-9i0j-1k2l-3m4n5o6p7q8r', 'M3A4B5C-06', 2),

-- Miembros para el plan "Evento de Networking"
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'M2A3B4C-04', 3), -- Propietario
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'M1A2B3C-01', 2),
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'T4D5E6F-02', 2),
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'W7G8H9I-03', 2),
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'T5D6E7F-05', 2),
('4d5e6f7g-8h9i-0j1k-2l3m-4n5o6p7q8r9s', 'M3A4B5C-06', 2),

-- Miembros para el plan "Encuentro de Emprendedores"
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'T5D6E7F-05', 3), -- Propietario
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'M1A2B3C-01', 2),
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'T4D5E6F-02', 2),
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'W7G8H9I-03', 2),
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'M2A3B4C-04', 2),
('5e6f7g8h-9i0j-1k2l-3m4n-5o6p7q8r9s0t', 'M3A4B5C-06', 2),

-- Miembros para el plan "Congreso de Salud"
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'M3A4B5C-06', 3), -- Propietario
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'M1A2B3C-01', 2),
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'T4D5E6F-02', 2),
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'W7G8H9I-03', 2),
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'M2A3B4C-04', 2),
('6f7g8h9i-0j1k-2l3m-4n5o-6p7q8r9s0t1u', 'T5D6E7F-05', 2),

-- Miembros para el plan "Foro de Educación"
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'T4D5E6F-02', 3), -- Propietario
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'M1A2B3C-01', 2),
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'W7G8H9I-03', 1),
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'M2A3B4C-04', 1),
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'T5D6E7F-05', 1),
('7g8h9i0j-1k2l-3m4n-5o6p-7q8r9s0t1u2v', 'M3A4B5C-06', 1),

-- Miembros para el plan "Festival de Cine"
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'W7G8H9I-03', 3), -- Propietario
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'M1A2B3C-01', 2),
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'T4D5E6F-02', 1),
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'M2A3B4C-04', 1),
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'T5D6E7F-05', 1),
('8h9i0j1k-2l3m-4n5o-6p7q-8r9s0t1u2v3w', 'M3A4B5C-06', 1),

-- Miembros para el plan "Expo de Arte"
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'M2A3B4C-04', 3), -- Propietario
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'M1A2B3C-01', 2),
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'T4D5E6F-02', 2),
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'W7G8H9I-03', 2),
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'T5D6E7F-05', 2),
('9i0j1k2l-3m4n-5o6p-7q8r-9s0t1u2v3w4x', 'M3A4B5C-06', 2),

-- Miembros para el plan "Conferencia de Negocios"
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'T5D6E7F-05', 3), -- Propietario
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'M1A2B3C-01', 2),
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'T4D5E6F-02', 2),
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'W7G8H9I-03', 2),
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'M2A3B4C-04', 1),
('0j1k2l3m-4n5o-6p7q-8r9s-0t1u2v3w4x5y', 'M3A4B5C-06', 1),

-- Miembros para el plan "Taller de Desarrollo Web"
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'M3A4B5C-06', 3), -- Propietario
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'M1A2B3C-01', 2),
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'T4D5E6F-02', 2),
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'W7G8H9I-03', 1),
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'M2A3B4C-04', 1),
('1k2l3m4n-5o6p-7q8r-9s0t-1u2v3w4x5y6z', 'T5D6E7F-05', 1),

-- Miembros para el plan "Hackathon de IA"
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'T4D5E6F-02', 3), -- Propietario
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'M1A2B3C-01', 2),
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'W7G8H9I-03', 2),
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'M2A3B4C-04', 2),
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'T5D6E7F-05', 1),
('2l3m4n5o-6p7q-8r9s-0t1u-2v3w4x5y6z7a', 'M3A4B5C-06', 1);

-- Inserción del nuevo plan para Harnina
INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('P000001-01', 'Feria de la FP', CURRENT_TIMESTAMP, '2024-06-15 17:00:00', 38.683333, -6.416667, 
'La Feria de la FP en Almendralejo es un evento anual que reúne a estudiantes, profesores y profesionales del sector educativo para mostrar los diferentes ciclos formativos que se imparten en la región. Este año, nuestro grupo participa exponiendo el increíble mundo del desarrollo de aplicaciones multiplataforma. Nuestra exposición incluye demostraciones de aplicaciones web, de escritorio y Android, desarrolladas por nuestros talentosos estudiantes. Es una oportunidad única para conocer de cerca cómo se crean y funcionan las aplicaciones que usamos a diario y descubrir las posibilidades que ofrece este campo. Te invitamos a visitarnos y a descubrir cómo la tecnología puede transformar tu futuro.', 
'PUBLICA');

-- Inserción de miembros del plan para Harnina
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
('P000001-01', 'M000001-01', 3), -- Propietario
('P000001-01', 'M1A2B3C-01', 2),
('P000001-01', 'T4D5E6F-02', 2),
('P000001-01', 'W7G8H9I-03', 2),
('P000001-01', 'M2A3B4C-04', 2),
('P000001-01', 'T5D6E7F-05', 2),
('P000001-01', 'M3A4B5C-06', 2);


-- Inserción de nuevos planes de desarrollo tecnológico con referencias en formato hexadecimal

INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('1a2b3c4d5e6f7a8b9c0d', 'Hackathon Junior Mérida', CURRENT_TIMESTAMP, '2024-06-20 18:00:00', 38.917042, -6.343007, 
'El Hackathon Junior en Mérida es un evento emocionante diseñado para jóvenes programadores que desean mostrar sus habilidades y creatividad en el desarrollo de software. Durante el evento, los participantes tendrán la oportunidad de trabajar en equipo para desarrollar aplicaciones innovadoras que resuelvan problemas del mundo real. Con un ambiente lleno de energía y colaboración, los jóvenes programadores se enfrentarán a desafíos que pondrán a prueba sus conocimientos y fomentarán el aprendizaje continuo. Es una experiencia enriquecedora que combina la diversión con el desarrollo profesional, impulsando el espíritu innovador y la pasión por la tecnología en los programadores junior.', 
'PUBLICA'),
('2b3c4d5e6f7a8b9c0d1e', 'Conferencia Tech Junior Almendralejo', CURRENT_TIMESTAMP, '2024-06-25 17:00:00', 38.683333, -6.416667, 
'La Conferencia Tech Junior en Almendralejo es un evento inspirador que reúne a jóvenes talentos del mundo de la programación y la tecnología. Los participantes asistirán a charlas y talleres interactivos presentados por expertos de la industria, cubriendo temas como desarrollo web, aplicaciones móviles y programación de software. Es una excelente oportunidad para que los programadores junior aprendan nuevas habilidades, se conecten con otros entusiastas de la tecnología y obtengan ideas innovadoras para sus propios proyectos. El evento promueve un ambiente de aprendizaje colaborativo, motivando a los asistentes a explorar nuevas fronteras en el desarrollo tecnológico.', 
'PUBLICA'),
('3c4d5e6f7a8b9c0d1e2f', 'Taller de Desarrollo en Badajoz', CURRENT_TIMESTAMP, '2024-07-05 16:00:00', 38.878545, -6.970504, 
'El Taller de Desarrollo en Badajoz es una sesión interactiva enfocada en la enseñanza de las mejores prácticas y técnicas en el desarrollo de software. Este evento está dirigido a programadores junior que desean mejorar sus habilidades y conocimientos en programación. Durante el taller, los asistentes participarán en actividades prácticas, resolviendo problemas reales bajo la guía de desarrolladores experimentados. Es una excelente oportunidad para aprender, compartir experiencias y desarrollar nuevas competencias en un entorno colaborativo y de apoyo. La atmósfera es siempre alegre y estimulante, alentando a los participantes a alcanzar su máximo potencial.', 
'PUBLICA'),
('4d5e6f7a8b9c0d1e2f3g', 'Feria de Tecnología en Zafra', CURRENT_TIMESTAMP, '2024-07-10 15:00:00', 38.425319, -6.417649, 
'La Feria de Tecnología en Zafra es un evento vibrante que celebra los avances y las innovaciones en el mundo de la tecnología. Este evento está especialmente diseñado para programadores junior, ofreciendo una plataforma para que presenten sus proyectos y aprendan de los expertos en el campo. Los asistentes tendrán la oportunidad de explorar exhibiciones tecnológicas, participar en talleres prácticos y asistir a presentaciones inspiradoras. La feria promueve la creatividad, la innovación y el entusiasmo por la tecnología, creando un ambiente donde los jóvenes programadores pueden crecer, aprender y conectarse con la comunidad tecnológica.', 
'PUBLICA');

-- Inserción de miembros del plan para los nuevos planes
INSERT INTO plan_miembros (plan_referencia, usuario_ref, rol_id) VALUES
-- Hackathon Junior Mérida
('1a2b3c4d5e6f7a8b9c0d', 'T5D6E7F-05', 3), -- Propietario
('1a2b3c4d5e6f7a8b9c0d', 'M000001-01', 2),
('1a2b3c4d5e6f7a8b9c0d', 'M2A3B4C-04', 2),
('1a2b3c4d5e6f7a8b9c0d', 'W7G8H9I-03', 2),
('1a2b3c4d5e6f7a8b9c0d', 'T4D5E6F-02', 2),

-- Conferencia Tech Junior Almendralejo
('2b3c4d5e6f7a8b9c0d1e', 'T5D6E7F-05', 3), -- Propietario
('2b3c4d5e6f7a8b9c0d1e', 'M000001-01', 2),
('2b3c4d5e6f7a8b9c0d1e', 'M2A3B4C-04', 2),
('2b3c4d5e6f7a8b9c0d1e', 'W7G8H9I-03', 2),
('2b3c4d5e6f7a8b9c0d1e', 'T4D5E6F-02', 2),

-- Taller de Desarrollo en Badajoz
('3c4d5e6f7a8b9c0d1e2f', 'T5D6E7F-05', 3), -- Propietario
('3c4d5e6f7a8b9c0d1e2f', 'M000001-01', 2),
('3c4d5e6f7a8b9c0d1e2f', 'M2A3B4C-04', 2),
('3c4d5e6f7a8b9c0d1e2f', 'W7G8H9I-03', 2),
('3c4d5e6f7a8b9c0d1e2f', 'T4D5E6F-02', 2),

-- Feria de Tecnología en Zafra
('4d5e6f7a8b9c0d1e2f3g', 'T5D6E7F-05', 3), -- Propietario
('4d5e6f7a8b9c0d1e2f3g', 'M000001-01', 2),
('4d5e6f7a8b9c0d1e2f3g', 'M2A3B4C-04', 2),
('4d5e6f7a8b9c0d1e2f3g', 'W7G8H9I-03', 2),
('4d5e6f7a8b9c0d1e2f3g', 'T4D5E6F-02', 2);

