CREATE TABLE team (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL,
);


CREATE TABLE player (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL,
    idteam BIGINT,
	CONSTRAINT playerteam
    FOREIGN KEY (idteam )
    REFERENCES team (id)
);

