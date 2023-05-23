﻿# 01-Microservicios-tramite-app
 ```
  PS C:\WINDOWS\system32> psql -U postgres -p 5433
 ```
 ```sql
CREATE DATABASE "demo-microservicios";

\c "demo-microservicios";

CREATE SCHEMA IF NOT EXISTS pjud;

SET search_path TO pjud;

CREATE TABLE causa (
  id bigint PRIMARY KEY,
  nombre varchar(30),
  fecha_creacion timestamp
);

CREATE TABLE tramite_causa (
  id bigint PRIMARY KEY,
  nombre_tramite varchar(50),
  fecha_creacion timestamp,
  causa_id bigint REFERENCES causa(id)
);


SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
AND table_type = 'BASE TABLE';
```
