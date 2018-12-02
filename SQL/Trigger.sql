-- Verifica se h� medicamento que chegue
create or replace TRIGGER updrst_med
AFTER UPDATE OF restantes ON Medicamentos
FOR EACH ROW
BEGIN
  IF (:new.Restantes < 0) THEN RAISE_APPLICATION_ERROR(-20001, 'N�o h� medicamento suficiente');
  END IF;
END;