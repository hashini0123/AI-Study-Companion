INSERT INTO users (id, username, email) VALUES
('U001', 'hashini', 'hashini@example.com'),
('U002', 'neepa', 'neepa@example.com');

INSERT INTO documents (id, user_id, file_name, file_path) VALUES
('DOC001', 'U001', 'Photosynthesis_Lecture.pdf', '/uploads/docs/1.pdf'),
('DOC002', 'U001', 'Java_Basics.pdf', '/uploads/docs/2.pdf');