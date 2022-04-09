INSERT INTO pessoa (nome,idade,endereco,sexo) VALUES ('Ramon', 32, 'Rua bem longe', 'M');
INSERT INTO pessoa (nome,idade,endereco,sexo) VALUES ('Fernando', 37, 'Rua Amazonas', 'M');
INSERT INTO pessoa (nome,idade,endereco,sexo) VALUES ('Catia', 30, 'Rua aqui', 'F');
INSERT INTO pessoa (nome,idade,endereco,sexo) VALUES ('professor', 70, 'Rua Ali', 'F');


INSERT INTO professor(pessoa_id) VALUES(4);



INSERT INTO aluno (ano,pessoa_id) VALUES (5,1);
INSERT INTO aluno (ano,pessoa_id) VALUES (5,2);
INSERT INTO aluno (ano,pessoa_id) VALUES (6,3);

INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES('turma1','manhã',20,1);
INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES('turma2','tarde',20,1);
INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES('turma3','noite',20,1);