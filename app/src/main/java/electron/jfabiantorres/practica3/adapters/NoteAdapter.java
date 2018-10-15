package electron.jfabiantorres.practica3.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import electron.jfabiantorres.practica3.R;
import electron.jfabiantorres.practica3.models.Note;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private List<Note> notes;

    public NoteAdapter (List<Note> notes) {
        this.notes = notes;
    }

    public void setNotes (List <Note> notes) {
        this.notes = notes;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView description;
        public TextView date;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.showTitle);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        final Note note = this.notes.get(position);

        viewHolder.title.setText(note.getTitle());
        viewHolder.description.setText(note.getDescription());
        viewHolder.date.setText(note.getDate());

    }

    @Override
    public int getItemCount() {
        return this.notes.size();
    }

}
