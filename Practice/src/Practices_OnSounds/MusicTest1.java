package Practices_OnSounds;

import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() throws InvalidMidiDataException {
		
		
		/* if the method we are calling throws error, then we have to handle it in the calling method */
		
		try {
			Sequencer seqr = MidiSystem.getSequencer();
			seqr.open();
			
			Sequence  seq = new Sequence(Sequence.PPQ, 4);
			
			Track trk = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 15, 20, 100);			
			MidiEvent noteOn = new MidiEvent(a, 1);
			trk.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 15, 90, 100);
			MidiEvent noteOff =  new MidiEvent(b, 100);
			trk.add(noteOff);
			
			seqr.setSequence(seq);
			seqr.start();
			
	
		}
		
		/* 
		 * MidiUnavailableException is thrown by getSequencer method 
		 */
		
		catch(MidiUnavailableException ex) {
			System.out.println("got Midi Unavailable Exception ");
			
			/*
			 * getStackTrace method to print the stack trace during method execution
			 */
			System.out.println(ex.getStackTrace());
		}
		
	}
}
