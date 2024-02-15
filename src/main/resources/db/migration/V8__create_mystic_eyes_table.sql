CREATE TABLE mystic_eyes (
	"mystic_eyes_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "passive" VARCHAR,
    "active" VARCHAR,
    "cooldown" INTEGER,
    "sheet_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id")
);