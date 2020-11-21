package patterns.creative.factory;
/*
Design Pattern..
Here MusicBuilder is the construction class which helps in creation of different implementation..
 */

class Music {
    private final boolean guitar;
    private final boolean drums;
    private final boolean piano;

    private Music(MusicBuilder builder) {
        this.guitar = builder.guitar;
        this.drums = builder.drums;
        this.piano = builder.piano;
    }

    @Override
    public String toString() {
        return "Guitar : " + guitar + ", Drums : " + drums + ", Piano : " + piano;
    }

    static class MusicBuilder {
        private boolean guitar;
        private boolean drums;
        private boolean piano;

        Music build() {
            return new Music(this);
        }

        MusicBuilder addGuitar() {
            this.guitar = true;
            return this;
        }

        MusicBuilder addDrum() {
            this.drums = true;
            return this;
        }

        MusicBuilder addPiano() {
            this.piano = true;
            return this;
        }
    }
}