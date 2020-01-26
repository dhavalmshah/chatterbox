CREATE TABLE IF NOT EXISTS USER_ACCOUNT
(
    user_id             VARCHAR(100)    PRIMARY KEY,
    password            VARCHAR(100)    NOT NULL,
    homeserver_list     BLOB            NOT NULL,
    access_token        VARCHAR(1000)   NOT NULL,
    mobile_number       INTEGER         NOT NULL,
    email_id            VARCHAR(30)     NOT NULL,
    is_active           VARCHAR(5)      NOT NULL,
    created_ts          TIMESTAMP,
    last_modified_ts    TIMESTAMP
)
