class BadDataSetException extends Exception {}

class MyUtilities {
	public double [] getDataSet(String setName) throws BadDataSetException
	{
		String file = setName + ".dset";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (IOException e) {
			throw new BadDataSetException();
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				;
			}
		}
	}
}

