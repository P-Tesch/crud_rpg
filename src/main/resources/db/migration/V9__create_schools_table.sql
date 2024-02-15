CREATE TABLE schools (
	"school_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "level" INTEGER NOT NULL,
    "sheet_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id")
);