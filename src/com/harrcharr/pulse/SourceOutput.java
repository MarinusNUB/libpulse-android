package com.harrcharr.pulse;

public class SourceOutput extends OwnedStreamNode {
	public SourceOutput(PulseContext pulse, long ptr) {
		super(pulse, ptr);
	}
	
	public void update(long ptr) {
		JNIPopulateStruct(ptr);
	}
	
	public void setMute(boolean mute, SuccessCallback cb) {
		mPulse.setSourceOutputMute(mIndex, mute, cb);
	}
	public void setVolume(Volume volume, SuccessCallback cb) {
		mPulse.setSourceOutputVolume(mIndex, volume, cb);
	}

	private final native void JNIPopulateStruct(long pSinkInputInfo);
}