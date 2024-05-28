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
('7f4d5e6a-7b8c-901d-e2f3-3456789012rr', 'Tour Cultural en Salamanca', CURRENT_TIMESTAMP, NULL, 40.970103, -5.663539, 'Tour por los principales monumentos de Salamanca', 'PUBLICA'),
('8f5d6e7a-8b9c-012d-e3f4-4567890123ss', 'Festival de Cine en San Sebastián', CURRENT_TIMESTAMP, NULL, 43.321065, -1.986933, 'Asistencia al Festival Internacional de Cine en San Sebastián', 'PRIVADA'),
('9f6d7e8a-9b0c-123d-e4f5-5678901234tt', 'Jornada de Golf en Marbella', CURRENT_TIMESTAMP, NULL, 36.510068, -4.882447, 'Día completo de golf en un campo de Marbella', 'PUBLICA');

INSERT INTO planes (referencia, titulo, fecha_creacion, fecha_fin, ubicacion_latitud, ubicacion_altitud, descripcion, modo) VALUES
('P000002-01', 'Hackathon Junior Mérida', CURRENT_TIMESTAMP, '2024-06-20 18:00:00', 38.917042, -6.343007, 
'El Hackathon Junior en Mérida es un evento emocionante diseñado para jóvenes programadores que desean mostrar sus habilidades y creatividad en el desarrollo de software. Durante el evento, los participantes tendrán la oportunidad de trabajar en equipo para desarrollar aplicaciones innovadoras que resuelvan problemas del mundo real. Con un ambiente lleno de energía y colaboración, los jóvenes programadores se enfrentarán a desafíos que pondrán a prueba sus conocimientos y fomentarán el aprendizaje continuo. Es una experiencia enriquecedora que combina la diversión con el desarrollo profesional, impulsando el espíritu innovador y la pasión por la tecnología en los programadores junior.', 
'PUBLICA'),
('P000003-01', 'Conferencia Tech Junior Almendralejo', CURRENT_TIMESTAMP, '2024-06-25 17:00:00', 38.683333, -6.416667, 
'La Conferencia Tech Junior en Almendralejo es un evento inspirador que reúne a jóvenes talentos del mundo de la programación y la tecnología. En esta conferencia, los asistentes podrán asistir a charlas y talleres impartidos por expertos en desarrollo de software, quienes compartirán sus conocimientos y experiencias. Es una excelente oportunidad para que los programadores junior aprendan sobre las últimas tendencias tecnológicas, descubran nuevas herramientas y metodologías, y se conecten con otros entusiastas de la tecnología. El evento fomenta un ambiente de aprendizaje, creatividad y entusiasmo, incentivando a los jóvenes a continuar explorando el apasionante mundo del desarrollo tecnológico.', 
'PUBLICA'),
('P000004-01', 'Bootcamp de Programación Badajoz', CURRENT_TIMESTAMP, '2024-06-30 16:00:00', 38.878545, -6.970654, 
'El Bootcamp de Programación en Badajoz es un evento intensivo de varios días, diseñado específicamente para programadores junior que buscan mejorar sus habilidades en desarrollo de software. Durante el bootcamp, los participantes recibirán formación práctica y teórica en diversas áreas de la programación, desde la creación de aplicaciones web hasta el desarrollo móvil. Con instructores experimentados y un enfoque en proyectos reales, este bootcamp ofrece una experiencia de aprendizaje inmersiva y dinámica. Los jóvenes programadores saldrán del evento con nuevas competencias y una mayor confianza en sus habilidades, preparados para enfrentar futuros desafíos tecnológicos con entusiasmo y creatividad.', 
'PUBLICA'),
('P000005-01', 'Taller de Innovación Tecnológica Zafra', CURRENT_TIMESTAMP, '2024-07-05 15:00:00', 38.424704, -6.417749, 
'El Taller de Innovación Tecnológica en Zafra es una jornada llena de creatividad y aprendizaje, dirigida a programadores junior que desean explorar nuevas fronteras en el desarrollo de software. A lo largo del día, los participantes tendrán la oportunidad de trabajar en proyectos innovadores, utilizando tecnologías emergentes y metodologías ágiles. El taller se centra en fomentar un ambiente colaborativo y motivador, donde los jóvenes programadores pueden intercambiar ideas, experimentar con nuevas soluciones y aprender de expertos en la industria. Es una experiencia única que combina la pasión por la tecnología con la alegría de la innovación, motivando a los asistentes a seguir creciendo en su carrera tecnológica.', 
'PUBLICA');
