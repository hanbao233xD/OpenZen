package sh1t.ze.event;

import sh1t.ze.event.Cancellable;
import sh1t.ze.event.EventMarker;

public abstract class Event
        implements Cancellable,
        EventMarker {
    public boolean cancelled;

    protected Event() {
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}