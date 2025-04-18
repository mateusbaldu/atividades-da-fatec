/*-------------------------------------
Exercicio 2
------------------------------------*/

DROP SCHEMA IF EXISTS `mydb`;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8;
USE `mydb`;


CREATE TABLE IF NOT EXISTS `mydb`.`Aluno` (
  `idAluno` INT NOT NULL,
  `nome` VARCHAR(50) NULL,
  `documento` VARCHAR(14) NULL,
  `email` VARCHAR(50) NULL,
  `data_nascimento` DATE NULL,
  `frequencia_percentual` FLOAT NULL,
  PRIMARY KEY (`idAluno`),
  UNIQUE INDEX `idAluno_UNIQUE` (`idAluno` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Professor` (
  `idProfessor` INT NOT NULL,
  `nome` VARCHAR(50) NULL,
  `documento` VARCHAR(14) NULL,
  `email` VARCHAR(50) NULL,
  `especialidade` VARCHAR(50) NULL,
  PRIMARY KEY (`idProfessor`),
  UNIQUE INDEX `idProfessor_UNIQUE` (`idProfessor` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Curso` (
  `idcurso` INT NOT NULL,
  `nome` VARCHAR(50) NULL,
  `idioma` VARCHAR(30) NULL,
  `nivel` VARCHAR(30) NULL,
  `carga_horaria` INT NULL,
  PRIMARY KEY (`idcurso`),
  UNIQUE INDEX `idcurso_UNIQUE` (`idcurso` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Matricula` (
  `idMatricula` INT NOT NULL,
  `aluno_id` INT NOT NULL,
  `curso_id` INT NOT NULL,
  `data` DATE NULL,
  `status` VARCHAR(20) NULL,
  PRIMARY KEY (`idMatricula`),
  UNIQUE INDEX `idMatricula_UNIQUE` (`idMatricula` ASC) VISIBLE,
  INDEX `idCurso_idx` (`curso_id` ASC) VISIBLE,
  INDEX `aluno_id_idx` (`aluno_id` ASC) VISIBLE,
  CONSTRAINT `aluno_id_fk_Matricula`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `mydb`.`Aluno` (`idAluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `curso_id_fk_Matricula`
    FOREIGN KEY (`curso_id`)
    REFERENCES `mydb`.`Curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Aula` (
  `idAula` INT NOT NULL,
  `curso_id` INT NOT NULL,
  `professor_id` INT NOT NULL,
  `materia` VARCHAR(20) NULL,
  `data` DATE NULL,
  `horario` TIME NULL,
  PRIMARY KEY (`idAula`),
  UNIQUE INDEX `idAula_UNIQUE` (`idAula` ASC) VISIBLE,
  INDEX `curso_id_idx` (`curso_id` ASC) VISIBLE,
  INDEX `professor_id_idx` (`professor_id` ASC) VISIBLE,
  CONSTRAINT `curso_id_fk_Aula`
    FOREIGN KEY (`curso_id`)
    REFERENCES `mydb`.`Curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `professor_id_fk_Aula`
    FOREIGN KEY (`professor_id`)
    REFERENCES `mydb`.`Professor` (`idProfessor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Administrador` (
  `idAdministrador` INT NOT NULL,
  `nome` VARCHAR(50) NULL,
  `email` VARCHAR(50) NULL,
  PRIMARY KEY (`idAdministrador`),
  UNIQUE INDEX `idAdministrador_UNIQUE` (`idAdministrador` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Pagamento` (
  `idPagamento` INT NOT NULL,
  `matricula_id` INT NOT NULL,
  `administrador_id` INT NOT NULL,
  `valor` FLOAT NULL,
  `data_pagamento` DATE NULL,
  `status_atual` VARCHAR(20) NULL,
  PRIMARY KEY (`idPagamento`),
  UNIQUE INDEX `idPagamento_UNIQUE` (`idPagamento` ASC) VISIBLE,
  INDEX `matricula_id_idx` (`matricula_id` ASC) VISIBLE,
  INDEX `administrador_id_idx` (`administrador_id` ASC) VISIBLE,
  CONSTRAINT `matricula_id_fk_Pagamento`
    FOREIGN KEY (`matricula_id`)
    REFERENCES `mydb`.`Matricula` (`idMatricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `administrador_id_fk_Pagamento`
    FOREIGN KEY (`administrador_id`)
    REFERENCES `mydb`.`Administrador` (`idAdministrador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Certificado` (
  `idCertificado` INT NOT NULL,
  `aluno_id` INT NOT NULL,
  `curso_id` INT NOT NULL,
  `data_emissao` DATE NULL,
  `administrador_id` INT NOT NULL,
  PRIMARY KEY (`idCertificado`),
  UNIQUE INDEX `idCertificado_UNIQUE` (`idCertificado` ASC) VISIBLE,
  INDEX `aluno_id_idx` (`aluno_id` ASC) VISIBLE,
  INDEX `curso_id_idx` (`curso_id` ASC) VISIBLE,
  CONSTRAINT `aluno_id_fk_Certificado`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `mydb`.`Aluno` (`idAluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `curso_id_fk_Certificado`
    FOREIGN KEY (`curso_id`)
    REFERENCES `mydb`.`Curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `administrador_id_fk_Certificado`
    FOREIGN KEY (`administrador_id`)
    REFERENCES `mydb`.`Administrador` (`idAdministrador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Salario` (
  `idSalario` INT NOT NULL,
  `professor_id` INT NOT NULL,
  `administrador_id` INT NOT NULL,
  `valor` FLOAT NULL,
  `data_pagamento` DATE NULL,
  PRIMARY KEY (`idSalario`),
  UNIQUE INDEX `idSalario_UNIQUE` (`idSalario` ASC) VISIBLE,
  INDEX `professor_id_idx` (`professor_id` ASC) VISIBLE,
  CONSTRAINT `professor_id_fk_Salario`
    FOREIGN KEY (`professor_id`)
    REFERENCES `mydb`.`Professor` (`idProfessor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `administrador_id_fk_Salario`
    FOREIGN KEY (`administrador_id`)
    REFERENCES `mydb`.`Administrador` (`idAdministrador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `mydb`.`Tarefa` (
  `idTarefa` INT NOT NULL,
  `aluno_id` INT NOT NULL,
  `professor_id` INT NOT NULL,
  `data_envio` DATE NULL,
  `data_conclusao` DATE NULL,
  `concluida` TINYINT NULL,
  `nota` FLOAT NULL,
  PRIMARY KEY (`idTarefa`),
  UNIQUE INDEX `idTarefa_UNIQUE` (`idTarefa` ASC) VISIBLE,
  INDEX `aluno_id_idx` (`aluno_id` ASC) VISIBLE,
  INDEX `professor_id_idx` (`professor_id` ASC) VISIBLE,
  CONSTRAINT `aluno_id_fk_Tarefa`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `mydb`.`Aluno` (`idAluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `professor_id_fk_Tarefa`
    FOREIGN KEY (`professor_id`)
    REFERENCES `mydb`.`Professor` (`idProfessor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


/*-------------------------------------
Exercicio 3
------------------------------------*/

START TRANSACTION;

INSERT INTO `mydb`.`Aluno` (`idAluno`, `nome`, `documento`, `email`, `data_nascimento`, `frequencia_percentual`)
VALUES 
    (0001, 'João Silva', '12345678901', 'joaosilvaficticio@email.com', '2000-01-01', 98.0),
    (0002, 'Miguel Henrique', '23456789012', 'miguelhenriqueficticio@email.com', '1998-05-12', 80.0),
    (0003, 'Ednaldo Pereira', '34567890123', 'ednaldopereiraficticio@email.com', '1995-08-23', 60.0);

INSERT INTO `mydb`.`Professor` (`idProfessor`, `nome`, `documento`, `email`, `especialidade`)
VALUES 
    (01, 'Norton Barros', '45678901234', 'nortonbarrosExistente@email.com', 'POO'),
    (02, 'Lucas Almeida', '56789012345', 'lucasalmeidaficticio@professor.com', 'Inglês'),
    (03, 'Ana Travassos', '67890123456', 'anatravassosExistente@professor.com', 'Sistemas Operacionais');

INSERT INTO `mydb`.`Curso` (`idcurso`, `nome`, `idioma`, `nivel`, `carga_horaria`)
VALUES 
    (01, 'Curso de Programação Orientada a Objetos', 'Português', 'Básico', 60),
    (02, 'Curso de Inglês', 'Inglês', 'Intermediário', 80),
    (03, 'Curso de Sistemas Operacionais', 'Português', 'Intermediário', 100);

INSERT INTO `mydb`.`Matricula` (`idMatricula`, `aluno_id`, `curso_id`, `data`, `status`)
VALUES 
    (0001, 0001, 01, '2025-01-01', 'Ativa'),
    (0002, 0002, 02, '2025-02-01', 'Ativa'),
    (0003, 0003, 03, '2025-03-01', 'Ativa');

INSERT INTO `mydb`.`Aula` (`idAula`, `curso_id`, `professor_id`, `materia`, `data`, `horario`)
VALUES 
    (001, 01, 01, 'Álgebra', '2025-01-10', '08:00:00'),
    (002, 02, 02, 'Herança', '2025-02-15', '12:00:00'),
    (003, 03, 03, 'Virtual Machines', '2025-03-20', '10:00:00');

INSERT INTO `mydb`.`Administrador` (`idAdministrador`, `nome`, `email`)
VALUES 
    (01, 'Carlos Lima', 'carloslimaficticio@admin.com'),
    (02, 'Julia Almeida', 'juliaalmeidaficticio@admin.com'),
    (03, 'Murilo Marques', 'murilomarquesficticio@email.com');

INSERT INTO `mydb`.`Pagamento` (`idPagamento`, `matricula_id`, `administrador_id`, `valor`, `data_pagamento`, `status_atual`)
VALUES 
    (0001, 0001, 01, 300.00, '2025-01-15', 'Pago'),
    (0002, 0002, 02, 350.00, '2025-02-20', 'Pago'),
    (0003, 0003, 03, 400.00, '2025-03-25', 'Pendente');

INSERT INTO `mydb`.`Certificado` (`idCertificado`, `aluno_id`, `curso_id`, `data_emissao`, `administrador_id`)
VALUES 
    (0001, 0001, 01, '2025-06-15', 1),
    (0002, 0002, 02, '2025-07-20', 2),
    (0003, 0003, 03, '2025-08-25', 3);

INSERT INTO `mydb`.`Salario` (`idSalario`, `professor_id`, `administrador_id`, `valor`, `data_pagamento`)
VALUES 
    (00001, 01, 01, 2500.00, '2025-01-30'),
    (00002, 02, 02, 3000.00, '2025-02-28'),
    (00003, 03, 03, 60000.00, '2025-03-31');

INSERT INTO `mydb`.`Tarefa` (`idTarefa`, `aluno_id`, `professor_id`, `data_envio`, `data_conclusao`, `concluida`, `nota`)
VALUES 
    (0000001, 0001, 01, '2025-01-05', '2025-01-10', 1, 9.5),
    (0000002, 0002, 02, '2025-02-05', '2025-02-10', 1, 8.0),
    (0000003, 0003, 03, '2025-03-05', '2025-03-10', 0, NULL);


UPDATE `mydb`.`Aluno`
SET `nome` = 'João Silva Lima', `frequencia_percentual` = 92.0
WHERE `idAluno` = 1;

UPDATE `mydb`.`Professor`
SET  `email` =  'nortonbarrosExiste@professor.com'
WHERE `idProfessor` = 1;

UPDATE `mydb`.`Curso`
SET `nivel` = 'Avançado'
WHERE `idcurso` = 2;

UPDATE `mydb`.`Matricula`
SET `status` = 'Cancelada'
WHERE `idMatricula` = 2;

UPDATE `mydb`.`Aula`
SET `horario` = '14:00:00'
WHERE `idAula` = 3;

UPDATE `mydb`.`Administrador`
SET `email` = 'murilomarquesficticio@admin.com'
WHERE `idAdministrador` = 3;

COMMIT;


/*-------------------------------------
Exercicio 4
------------------------------------*/

SELECT sum(valor) as total_pagamentos
FROM Pagamento;

SELECT max(nota) as maior_nota
FROM Tarefa;

SELECT min(nota) as menor_nota
FROM Tarefa;

SELECT avg(valor) as media_salarial
FROM Salario;

SELECT count(idMatricula) as total_matriculas
FROM Matricula;


/*-------------------------------------
Exercicio 5
------------------------------------*/
SELECT 
    a.nome AS adm,
    s.valor AS salario,
    p.valor AS pagamento
FROM Administrador a
INNER JOIN Salario s
ON a.idAdministrador = s.administrador_id
INNER JOIN Pagamento p
ON a.idAdministrador = p.administrador_id;


/*-------------------------------------
Exercicio 6
------------------------------------*/
SELECT 
    a.nome AS aluno,
    m.status AS status_matricula,
    c.nome AS nome_curso
FROM Aluno a
LEFT OUTER JOIN Matricula m
ON a.idAluno = m.aluno_id
LEFT OUTER JOIN Curso c
ON m.curso_id = c.idcurso;
