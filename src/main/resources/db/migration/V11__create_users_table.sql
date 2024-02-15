CREATE TABLE users (
	"user_id" serial PRIMARY KEY,
    "login" VARCHAR NOT NULL,
    "password" VARCHAR NOT NULL,
    "sheet_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id")
);