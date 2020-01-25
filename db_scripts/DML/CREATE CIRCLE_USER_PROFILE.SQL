CREATE TABLE IF NOT EXISTS CIRCLE_USER_PROFILE
(
    circle_user_id          VARCHAR(100)    PRIMARY KEY,
    user_id                 VARCHAR(100)            ,
    homeserver              VARCHAR(256)    NOT NULL,
    access_token            VARCHAR(1000)   NOT NULL,
    mobile_number           INTEGER         NOT NULL,
    email_id                VARCHAR(30)     NOT NULL,
    circle_power_level      INTEGER         DEFAULT 50,
    user_bio                VARCHAR(250)            ,
    is_active               VARCHAR(5)      NOT NULL,
    create_ts               TIMESTAMP               ,
    last_modified_ts        TIMESTAMP,
    FOREIGN KEY(user_id)    REFERENCES      identity_server_db.USER_ACCOUNT(user_id)
);