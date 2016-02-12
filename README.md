# LoaderExample

A CHILD activity is launched -> ROTATION -> BACK button pressed (Wrong)
At that time, old loader's onReset is called. 

Old loader will be destroyed. New loader will be created and new loader's  loadInBackground will be triggered again.

The correct behavior I'm expecting is, no new loader will be created.
