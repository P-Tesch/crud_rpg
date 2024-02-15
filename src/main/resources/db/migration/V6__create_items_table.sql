CREATE TABLE items (
	"item_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "damage" INTEGER,
    "sheet_id" INTEGER,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id")
);