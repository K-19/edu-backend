CREATE ROLE edu_super_user WITH
    LOGIN
    SUPERUSER
    CREATEDB
    CREATEROLE
    INHERIT
    NOREPLICATION
    CONNECTION LIMIT -1
    PASSWORD 'qwerty12345';
COMMENT ON ROLE edu_super_user IS 'Суперпользователь для edu_db';

CREATE DATABASE edu_db
    WITH
    OWNER = edu_super_user
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE edu_db
    IS 'База данных проекта EDU';