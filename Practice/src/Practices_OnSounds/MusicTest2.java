package Practices_OnSounds;
import javax.sound.midi.*;

public class MusicTest2 {
    
    public void play() throws InvalidMidiDataException, MidiUnavailableException {
        
        // Creating a sequencer and opening it
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        
        // Creating a new sequence
        Sequence sequence = new Sequence(Sequence.PPQ, 4);
        
        // Creating an empty track
        Track track = sequence.createTrack();
        
        // Creating a MIDI message for note on
        ShortMessage noteOnMessage = new ShortMessage();
        noteOnMessage.setMessage(144, 1, 50, 100); // Note on command (144), channel (1), note number (50), velocity (100)
        
        // Creating a MIDI event for note on and adding it to the track
        MidiEvent noteOnEvent = new MidiEvent(noteOnMessage, 1);
        track.add(noteOnEvent);
        
        // Creating a MIDI message for note off
        ShortMessage noteOffMessage = new ShortMessage();
        noteOffMessage.setMessage(128, 1, 50, 100); // Note off command (128), channel (1), note number (50), velocity (100)
        
        // Creating a MIDI event for note off and adding it to the track
        MidiEvent noteOffEvent = new MidiEvent(noteOffMessage, 100);
        track.add(noteOffEvent);
        
        // Setting the sequence to the sequencer and starting playback
        sequencer.setSequence(sequence);
        sequencer.start();
    }
}
