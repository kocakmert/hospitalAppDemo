# Veri Tabanı Tabloları ve Sequence Scriptleri 

-- Hospital Tablosu 

-- Table: public.HOSPITAL

-- DROP TABLE IF EXISTS public."HOSPITAL";

CREATE TABLE IF NOT EXISTS public."HOSPITAL"
(
    "HOSPITAL_ID" integer NOT NULL,
    "HOSPITAL_NAME" character varying(50) COLLATE pg_catalog."default",
    "HOSPITAL_ADRESS" character varying(255) COLLATE pg_catalog."default",
    "HOSPITAL_TYPE" numeric,
    CONSTRAINT hospital_pkey PRIMARY KEY ("HOSPITAL_ID")
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."HOSPITAL"
    OWNER to postgres;

COMMENT ON TABLE public."HOSPITAL"
    IS 'Hospital table';

-- SEQUENCE: public.seq_hospital

-- DROP SEQUENCE IF EXISTS public.seq_hospital;

CREATE SEQUENCE IF NOT EXISTS public.seq_hospital
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 99999999999999
    CACHE 1
    OWNED BY "HOSPITAL"."HOSPITAL_ID";

ALTER SEQUENCE public.seq_hospital
    OWNER TO postgres;

-- Table: public.PATIENT

-- DROP TABLE IF EXISTS public."PATIENT";

CREATE TABLE IF NOT EXISTS public."PATIENT"
(
    "PATIENT_ID" bigint NOT NULL,
    "PATIENT_FIRST_NAME" character varying(10) COLLATE pg_catalog."default",
    "PATIENT_LAST_NAME" character varying(30) COLLATE pg_catalog."default",
    "PATIENT_GENDER" numeric,
    "PATIENT_AGE" numeric,
    "PATIENT_TC" character varying(11) COLLATE pg_catalog."default",
    "PATIENT_ADRESS" character varying(255) COLLATE pg_catalog."default",
    "PATIENT_COMPLAINT" character varying(255) COLLATE pg_catalog."default",
    "HOSPITAL_ID" integer,
    CONSTRAINT "PATIENT_pkey" PRIMARY KEY ("PATIENT_ID"),
    CONSTRAINT fk_hospital_patient FOREIGN KEY ("HOSPITAL_ID")
        REFERENCES public."HOSPITAL" ("HOSPITAL_ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."PATIENT"
    OWNER to postgres;

-- SEQUENCE: public.seq_patient

-- DROP SEQUENCE IF EXISTS public.seq_patient;

CREATE SEQUENCE IF NOT EXISTS public.seq_patient
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999
    CACHE 1
    OWNED BY "PATIENT"."PATIENT_ID";

ALTER SEQUENCE public.seq_patient
    OWNER TO postgres;

-- Table: public.HOSPITAL_TYPE_LOOK_UP

-- DROP TABLE IF EXISTS public."HOSPITAL_TYPE_LOOK_UP";

CREATE TABLE IF NOT EXISTS public."HOSPITAL_TYPE_LOOK_UP"
(
    "ID" numeric NOT NULL,
    "NAME" character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT "HOSPITAL_TYPE_pkey" PRIMARY KEY ("ID")
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."HOSPITAL_TYPE_LOOK_UP"
    OWNER to postgres;


    

