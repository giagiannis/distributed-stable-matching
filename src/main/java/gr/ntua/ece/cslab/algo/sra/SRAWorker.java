package gr.ntua.ece.cslab.algo.sra;

import java.io.IOException;

import gr.ntua.ece.cslab.algo.Message;

import org.apache.hadoop.io.NullWritable;
import org.apache.hama.bsp.BSP;
import org.apache.hama.bsp.BSPPeer;
import org.apache.hama.bsp.sync.SyncException;

public class SRAWorker extends
		BSP<NullWritable, NullWritable, NullWritable, NullWritable, Message> {

	@Override
	public void setup(
			BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, Message> peer)
			throws IOException, SyncException, InterruptedException {
		super.setup(peer);
	}

	@Override
	public void bsp(
			BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, Message> arg0)
			throws IOException, SyncException, InterruptedException {

	}

	@Override
	public void cleanup(
			BSPPeer<NullWritable, NullWritable, NullWritable, NullWritable, Message> peer)
			throws IOException {
		super.cleanup(peer);
	}

}
