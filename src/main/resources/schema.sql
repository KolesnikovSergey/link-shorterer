DROP TABLE LINK IF EXISTS;
CREATE TABLE LINK
(
    ID          NUMBER PRIMARY KEY AUTO_INCREMENT,
    CREATE_DATE TIMESTAMP NOT NULL,
    LONG_LINK   VARCHAR   NOT NULL,
    SHORT_LINK  VARCHAR   NOT NULL
);

commit;