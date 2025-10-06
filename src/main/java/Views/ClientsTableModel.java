package Views;

import Models.Clients;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ClientsTableModel extends AbstractTableModel {

    private final String[] cols = {"Nombre", "Apellido", "DNI", "Email"};
    private final List<Clients> data;
    
    
    public ClientsTableModel() {
        this.data = new ArrayList<>();
    }
    public ClientsTableModel(List<Clients> initial) {
        this();
        if (initial != null) data.addAll(initial);
    }

    
    public void setData(List<Clients> nuevos) {
        data.clear();
        if (nuevos != null) data.addAll(nuevos);
        fireTableDataChanged();
    }
    public Clients getAt(int row) { return data.get(row); }
    public void add(Clients c) {
        int r = data.size();
        data.add(c);
        fireTableRowsInserted(r, r);
    }
    public void update(int row, Clients c) {
        data.set(row, c);
        fireTableRowsUpdated(row, row);
    }
    public void remove(int row) {
        data.remove(row);
        fireTableRowsDeleted(row, row);
    }

    
    @Override public int getRowCount()             { return data.size(); }
    @Override public int getColumnCount()          { return cols.length; }
    @Override public String getColumnName(int c)   { return cols[c]; }
    @Override public Class<?> getColumnClass(int c){ return c == 2 ? Long.class : String.class; }
    @Override public boolean isCellEditable(int r, int c) { return false; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clients cli = data.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> cli.getName();
            case 1 -> cli.getLastName(); 
            case 2 -> cli.getDni();        
            case 3 -> cli.getEmail();
            default -> null;
        };
    }
}
