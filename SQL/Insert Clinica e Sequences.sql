-- Insert dos dados da Clinica
INSERT INTO Tipo_Analises (tipo_analises_id, nome) VALUES (1, 'Urina');
INSERT INTO Tipo_Analises (tipo_analises_id, nome) VALUES (2, 'Sangue');

INSERT INTO Tipo_Consultas (tipo_consultas_id, nome) VALUES (1, 'Oftalmologia');
INSERT INTO Tipo_Consultas (tipo_consultas_id, nome) VALUES (2, 'Dermatologista');

INSERT INTO Tipo_Exames (tipo_exame_id, nome) VALUES (1, 'TAC');
INSERT INTO Tipo_Exames (tipo_exame_id, nome) VALUES (2, 'Ecografia');
INSERT INTO Tipo_Exames (tipo_exame_id, nome) VALUES (3, 'Radiografia');

INSERT INTO Tipo_Vacinas (tipo_vacinas_id, nome) VALUES (1, 'Penicilina');
INSERT INTO Tipo_Vacinas (tipo_vacinas_id, nome) VALUES (2, 'Antibiotico');

INSERT INTO Medicos(medicos_id, nome, morada, especialidade) VALUES (1, 'Branco', 'Largo do Cima','Oftalmologia');
INSERT INTO Medicos(medicos_id, nome, morada, especialidade) VALUES (2, 'Brandao', 'Largo do Baixo','Neurocirurgiao');


INSERT INTO Medicamentos (medicamentos_id, medicos_id_Medicos, nome, dose, periodicidade, quantidade, restantes, data_final) VALUES (1, 1, 'Brufen', 3, 3, 20, 20, to_date('2013-01-25','yyyy-mm-dd'));
INSERT INTO Medicamentos (medicamentos_id, medicos_id_Medicos, nome, dose, periodicidade, quantidade, restantes, data_final) VALUES (2, 1, 'Trifene', 1, 1, 10, 10, to_date('2013-03-31','yyyy-mm-dd'));

INSERT INTO Users (user_id, nome, morada, telefone, username, password, email) VALUES (1, 'Bruno', 'Rua de Cima', '253123123', 'brunotiago', 'b8757b80d184a3117517a177601cada7', 'brunotiagoaraujo@gmail.com');
INSERT INTO Users (user_id, nome, morada, telefone, username, password, email) VALUES (2, 'David', 'Rua do Lado', '253456456', 'davidbranco', 'password', 'davidbranco88@gmail.com');

INSERT INTO User_Medicamentos (user_id_Users, medicamentos_id_Medicamentos) VALUES (2, 1);
INSERT INTO User_Medicamentos (user_id_Users, medicamentos_id_Medicamentos) VALUES (2, 2);

INSERT INTO Consultas (consultas_id, tipo_cons_id_Tipo_Cons, local, motivo, urgencia, resumo, preco, medicamentos_id_Medicamentos) VALUES (3, 1, 'Clinica de Braga', 'Doença', 0, 'Tava doente', 12, 1);
INSERT INTO Consultas (consultas_id, tipo_cons_id_Tipo_Cons, local, motivo, urgencia, resumo, preco, medicamentos_id_Medicamentos) VALUES (4, 1, 'Clinica Dr. Cenas', 'Consulta de rotina', 0, 'Correu bem', 70, 2);

INSERT INTO Analises (analises_id, tipo_analises_id_Tipo_Analises, local, preco) VALUES (1, 1, 'Clinica Paulo', 10);
INSERT INTO Analises (analises_id, tipo_analises_id_Tipo_Analises, local, preco) VALUES (2, 1, 'Clinica Cruz', 7);

INSERT INTO Vacinas (vacinas_id, tipo_vacinas_id_Tipo_Vacinas, dose, periodicidade, preco) VALUES (1, 2, 10, 2, 0);

INSERT INTO Exames (exames_id, tipo_exame_id_Tipos_Exames, local) VALUES (1, 1, 'TAC Center');

INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (3, 1, to_date('2013-01-31','yyyy-mm-dd'), 3, NULL, NULL, NULL);
INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (5, 1, to_date('2013-01-30','yyyy-mm-dd'), NULL, 1, NULL, NULL);
INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (6, 1, to_date('2013-01-29','yyyy-mm-dd'), NULL, NULL, NULL, 1);
INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (7, 2, to_date('2013-01-31','yyyy-mm-dd'), NULL, NULL, 1, NULL);
INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (8, 2, to_date('2013-02-04','yyyy-mm-dd'), 4, NULL, NULL, NULL);
INSERT INTO Episodios (eps_id, medicos_id_Medicos, data, consultas_id_Consultas, exames_id_Exames, analises_id_Analises, vacinas_id_Vacinas) VALUES (9, 2, to_date('2013-02-21','yyyy-mm-dd'), NULL, NULL, 2, NULL);

INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 3);
INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 5);
INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 6);
INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 7);
INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 8);
INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES (2, 9);

-- Sequences
CREATE SEQUENCE Users_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20;
 
CREATE SEQUENCE User_Eps_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 

CREATE SEQUENCE User_Medicamentos_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Medicos_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 

CREATE SEQUENCE Medicamentos_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Vacinas_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Tipo_Vacinas_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 

CREATE SEQUENCE Episodios_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 

CREATE SEQUENCE Analises_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Tipo_Analises_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 

CREATE SEQUENCE Consultas_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Exames_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Tipo_Consultas_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 
 
CREATE SEQUENCE Tipo_Exames_seq

  MINVALUE 1
  START WITH 100
  INCREMENT BY 1
  CACHE 20; 