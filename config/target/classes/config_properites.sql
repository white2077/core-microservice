CREATE TABLE config_properties
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    application VARCHAR(50)  NOT NULL,
    profile     VARCHAR(20)  NOT NULL,
    label       VARCHAR(20)  NOT NULL DEFAULT 'master',
    key         VARCHAR(255) NOT NULL,
    value       TEXT         NOT NULL
);
