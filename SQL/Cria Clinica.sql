CREATE TABLE  Users  (
 user_id  number(20,0) PRIMARY KEY    ,
 nome   varchar2(70)           ,
 morada   varchar2(70)           ,
 telefone   varchar2(70)     ,
 username   varchar2(70)     ,
 password   varchar2(70)     ,
 email   varchar2(70)     
);

CREATE TABLE  User_Eps  (
 user_id_Users  number(20,0),
 eps_id_Episodios  number(20,0)     
);

CREATE TABLE  Episodios  (
 eps_id  number(20,0) PRIMARY KEY      ,
 medicos_id_Medicos  number(20,0)     ,
 data  DATE     ,
 consultas_id_Consultas  number(20,0) NULL    ,
 exames_id_Exames  number(20,0) NULL     ,
 analises_id_Analises  number(20,0) NULL     ,
 vacinas_id_Vacinas  number(20,0) NULL     
);

CREATE TABLE  Consultas  (
 consultas_id  number(20,0) PRIMARY KEY      ,
 tipo_cons_id_Tipo_Cons  number(20,0)     ,
 local   varchar2(70)     ,
 motivo   varchar2(70)     ,
 urgencia  number(20,0)     ,
 resumo   varchar2(70)     ,
 preco  number(20,2)     ,
 medicamentos_id_Medicamentos  number(20,0)     
);

CREATE TABLE  Exames  (
 exames_id  number(20,0) PRIMARY KEY      ,
 tipo_exame_id_Tipos_Exames  number(20,0)     ,
 local   varchar2(70)     
);

CREATE TABLE  Tipo_Exames  (
 tipo_exame_id  number(20,0) PRIMARY KEY      ,
 nome   varchar2(70)     
);

CREATE TABLE  Analises  (
 analises_id  number(20,0) PRIMARY KEY      ,
 tipo_analises_id_Tipo_Analises  number(20,0)     ,
 local   varchar2(70)     ,
 preco  number(20,2)     
);

CREATE TABLE  Tipo_Analises  (
 tipo_analises_id  number(20,0) PRIMARY KEY      ,
 nome   varchar2(70)     
);

CREATE TABLE  Tipo_Consultas  (
 tipo_consultas_id  number(20,0) PRIMARY KEY      ,
 nome   varchar2(70)     
);

CREATE TABLE  Vacinas  (
 vacinas_id  number(20,0) PRIMARY KEY      ,
 tipo_vacinas_id_Tipo_Vacinas  number(20,0)     ,
 dose  number(20,0)     ,
 periodicidade  number(20,0)     ,
 preco  number(20,2)     
);

CREATE TABLE  Tipo_Vacinas  (
 tipo_vacinas_id  number(20,0) PRIMARY KEY      ,
 nome   varchar2(70)     
);

CREATE TABLE  Medicos  (
 medicos_id  number(20,0) PRIMARY KEY      ,
 nome   varchar2(70)     ,
 morada   varchar2(70)     ,
 especialidade   varchar2(70)     
);

CREATE TABLE  Medicamentos  (
 medicamentos_id  number(20,0) PRIMARY KEY      ,
 medicos_id_Medicos  number(20,0)     ,
 nome   varchar2(70)     ,
 dose  number(20,0)     ,
 periodicidade  number(20,0)     ,
 quantidade  number(20,0)     ,
 restantes  number(20,0)     ,
 data_final  DATE     
);

CREATE TABLE  User_Medicamentos  (
 user_id_Users  number(20,0)   ,
 medicamentos_id_Medicamentos  number(20,0)     
);

ALTER TABLE  User_Eps  ADD FOREIGN KEY (user_id_Users) REFERENCES  Users  ( user_id );
ALTER TABLE  User_Eps  ADD FOREIGN KEY (eps_id_Episodios) REFERENCES  Episodios  ( eps_id );
ALTER TABLE  Episodios  ADD FOREIGN KEY (medicos_id_Medicos) REFERENCES  Medicos  ( medicos_id );
ALTER TABLE  Episodios  ADD FOREIGN KEY (consultas_id_Consultas) REFERENCES  Consultas  ( consultas_id );
ALTER TABLE  Episodios  ADD FOREIGN KEY (exames_id_Exames) REFERENCES  Exames  ( exames_id );
ALTER TABLE  Episodios  ADD FOREIGN KEY (analises_id_Analises) REFERENCES  Analises  ( analises_id );
ALTER TABLE  Episodios  ADD FOREIGN KEY (vacinas_id_Vacinas) REFERENCES  Vacinas  ( vacinas_id );
ALTER TABLE  Consultas  ADD FOREIGN KEY (tipo_cons_id_Tipo_Cons) REFERENCES  Tipo_Consultas  ( tipo_consultas_id );
ALTER TABLE  Consultas  ADD FOREIGN KEY (medicamentos_id_Medicamentos) REFERENCES  Medicamentos  ( medicamentos_id );
ALTER TABLE  Exames  ADD FOREIGN KEY (tipo_exame_id_Tipos_Exames) REFERENCES  Tipo_Exames  ( tipo_exame_id );
ALTER TABLE  Analises  ADD FOREIGN KEY (tipo_analises_id_Tipo_Analises) REFERENCES  Tipo_Analises  ( tipo_analises_id );
ALTER TABLE  Vacinas  ADD FOREIGN KEY (tipo_vacinas_id_Tipo_Vacinas) REFERENCES  Tipo_Vacinas  ( tipo_vacinas_id );
ALTER TABLE  Medicamentos  ADD FOREIGN KEY (medicos_id_Medicos) REFERENCES  Medicos  ( medicos_id );
ALTER TABLE  User_Medicamentos  ADD FOREIGN KEY (user_id_Users) REFERENCES  Users  ( user_id );
ALTER TABLE  User_Medicamentos  ADD FOREIGN KEY (medicamentos_id_Medicamentos) REFERENCES  Medicamentos  ( medicamentos_id );