package sh1t.ze.event;

import sh1t.ze.event.EventMarker;

public abstract class AbstractCancellable
        implements EventMarker {
    private boolean cancelled;

    protected AbstractCancellable() {
    }

    public void cancel() {
        this.cancelled = true;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }
}