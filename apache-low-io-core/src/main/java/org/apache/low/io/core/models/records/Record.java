package org.apache.low.io.core.models.records;

import org.apache.low.io.core.models.records.cells.Cell;

import java.util.ArrayList;
import java.util.List;

public class Record {

    private final List<Cell> cells = new ArrayList<>();

    public boolean addCell(final Cell cell) {
        return cells.add(cell);
    }
}
