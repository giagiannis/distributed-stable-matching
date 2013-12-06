package gr.ntua.ece.cslab.algo.sma;

import java.io.IOException;

import gr.ntua.ece.cslab.algo.Message;

import org.apache.hadoop.io.NullWritable;
import org.apache.hama.bsp.BSP;
import org.apache.hama.bsp.BSPPeer;
import org.apache.hama.bsp.sync.SyncException;

public class SMAWorker extends BSP<Message, NullWritable, NullWritable, NullWritable, NullWritable> {

	@Override
	public void setup(
			BSPPeer<Message, NullWritable, NullWritable, NullWritable, NullWritable> peer)
			throws IOException, SyncException, InterruptedException {
		super.setup(peer);
	}

	@Override
	public void bsp(
			BSPPeer<Message, NullWritable, NullWritable, NullWritable, NullWritable> peer)
			throws IOException, SyncException, InterruptedException {
		
	}
	
	@Override
	public void cleanup(
			BSPPeer<Message, NullWritable, NullWritable, NullWritable, NullWritable> peer)
			throws IOException {
		super.cleanup(peer);
	}

}
