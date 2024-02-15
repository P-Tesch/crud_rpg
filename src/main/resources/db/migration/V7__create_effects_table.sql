CREATE TABLE effects (
	"effect_id" serial PRIMARY KEY,
    "name" VARCHAR NOT NULL,
    "description" VARCHAR NOT NULL,
    "remaining_turns" INTEGER,
    "item_id" INTEGER,
    "sheet_id" INTEGER,

    CONSTRAINT "fk_item_id" FOREIGN KEY ("item_id") REFERENCES "items"("item_id"),
    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id"),
    CONSTRAINT "xor_sheet_item" CHECK (("item_id" IS NULL) != ("sheet_id" IS NULL))
);