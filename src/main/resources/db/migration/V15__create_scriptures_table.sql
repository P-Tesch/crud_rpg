CREATE TABLE scriptures (
	"scripture_id" serial PRIMARY KEY,
    "creation_points" INTEGER NOT NULL,
    "remaining_scripture_points" INTEGER NOT NULL,
    "damage" INTEGER NOT NULL,
    "range" INTEGER NOT NULL,
    "sharpness" INTEGER NOT NULL,
    "double" BOOLEAN NOT NULL,
    "sheet_id" INTEGER NOT NULL,

    CONSTRAINT "fk_sheet_id" FOREIGN KEY ("sheet_id") REFERENCES "sheets"("sheet_id")
);