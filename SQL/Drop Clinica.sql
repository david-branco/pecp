-- Drop tabelas da clinica
DROP TABLE Analises CASCADE Constraints;
DROP TABLE Consultas CASCADE Constraints;
DROP TABLE Episodios CASCADE Constraints;
DROP TABLE Exames CASCADE Constraints;
DROP TABLE Medicamentos CASCADE Constraints;
DROP TABLE Medicos CASCADE Constraints;
DROP TABLE Tipo_Analises CASCADE Constraints;
DROP TABLE Tipo_Consultas CASCADE Constraints;
DROP TABLE Tipo_Exames CASCADE Constraints;
DROP TABLE Tipo_Vacinas CASCADE Constraints;
DROP TABLE User_Eps CASCADE Constraints;
DROP TABLE User_Medicamentos CASCADE Constraints;
DROP TABLE Users CASCADE Constraints;
DROP TABLE Vacinas CASCADE Constraints;

-- Drop Sequences
DROP SEQUENCE Users_seq;
DROP SEQUENCE User_Eps_seq;
DROP SEQUENCE User_Medicamentos_seq;
DROP SEQUENCE Medicos_seq;
DROP SEQUENCE Medicamentos_seq;
DROP SEQUENCE Vacinas_seq;
DROP SEQUENCE Tipo_Vacinas_seq;
DROP SEQUENCE Episodios_seq;
DROP SEQUENCE Analises_seq;
DROP SEQUENCE Tipo_Analises_seq;
DROP SEQUENCE Consultas_seq;
DROP SEQUENCE Exames_seq;
DROP SEQUENCE Tipo_Consultas_seq;
DROP SEQUENCE Tipo_Exames_seq;