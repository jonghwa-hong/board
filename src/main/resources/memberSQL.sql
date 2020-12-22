CREATE SEQUENCE SEQ_MEMBER START WITH 1 INCREMENT BY 1 MAXVALUE 999 CYCLE NOCACHE;

CREATE TABLE member (
                        idx_member number(3),
                        MEMBER_ID VARCHAR2(20) PRIMARY KEY,
                        MEMBER_PW VARCHAR2(20),
                        MEMBER_NAME VARCHAR2(20)
);

INSERT INTO member (idx_member, MEMBER_ID, MEMBER_PW, MEMBER_NAME)
VALUES (SEQ_MEMBER.nextval, 'admin', '1111', 'zzzongA');
