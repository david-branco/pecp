SELECT *
FROM Users;

SELECT *
FROM Medicos;

SELECT *
FROM Tipo_Vacinas;

SELECT *
FROM Tipo_Analises;

SELECT *
FROM Tipo_Exames;

SELECT *
FROM Tipo_Consultas;

DELETE FROM Users
WHERE user_id = 'XXXXXXXX';

DELETE FROM Medicos
WHERE medicos_id = 'XXXXXXXX';

-- Apaga Tipo de Vacinas ,senão estiver ligado a alguma Vacina
DELETE FROM Tipo_Vacinas
WHERE (tipo_vacinas_id = XXXXXXX) AND not exists (SELECT *
                                                  FROM Vacinas
                                                  WHERE tipo_vacinas_id_tipo_vacinas = XXXXXXX);

-- Apaga Tipo de Analises ,senão estiver ligado a alguma Analise 
DELETE FROM Tipo_Analises
WHERE (tipo_analises_id = XXXXXXX) AND not exists (SELECT *
                                                   FROM Analises
                                                   WHERE tipo_analises_id_tipo_analises = XXXXXXX);

-- Apaga Tipo de Exames ,senão estiver ligado a algum exames
DELETE FROM Tipo_Exames
WHERE (tipo_exames_id = XXXXXXX) AND not exists (SELECT *
                                                 FROM Exames
                                                 WHERE tipo_exames_id_tipo_exames = XXXXXXX);
 
-- Apaga Tipo de Consultas ,senão estiver ligado a alguma Consultas
DELETE FROM Tipo_Consultas
WHERE (tipo_consultas_id = XXXXXXX) AND not exists (SELECT *
                                                    FROM CONSULTAS
                                                    WHERE tipo_consultas_id_tipo_consultas = XXXXXXX);
                                                     
-- Apaga Medicos ,senão estiver ligado a alguma Medicamento
DELETE FROM Medicos
WHERE (medico_id = XXXXXXX) AND not exists (SELECT *
                                            FROM Medicamentos
                                            WHERE medicamentos_id = XXXXXXX); 
                            AND not exists (SELECT *
                                            FROM Episodios
                                            WHERE medicos_id_Medicos = XXXXXXX);  
                                                     

-- Updates
UPDATE User
SET nome = 'XXXX', morada = 'XXXX', morada = 'XXXX', telefone = 'XXXX', username = 'XXXX', email= 'XXXX'
WHERE user_id = XXXXXXXX;

UPDATE Medicos
SET nome = 'XXXX', morada = 'XXXX', especialidade = 'XXXX'
WHERE medicos_id = XXXXXXXX;

