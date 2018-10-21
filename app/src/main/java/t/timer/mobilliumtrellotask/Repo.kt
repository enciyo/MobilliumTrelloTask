package t.timer.mobilliumtrellotask


data class Repo(val title:String,val drawable: Int)

class Repos {
    companion object {
        val repo = arrayListOf<Repo>(
            Repo("Item-0",R.drawable.gdgtekirdag),
            Repo("Item-1",R.drawable.gdgtekirdag),
            Repo("Item-2",R.drawable.gdgtekirdag),
            Repo("Item-3",R.drawable.gdgtekirdag),
            Repo("Item-4",R.drawable.gdgtekirdag),
            Repo("Item-5",R.drawable.gdgtekirdag),
            Repo("Item-6",R.drawable.gdgtekirdag),
            Repo("Item-7",R.drawable.gdgtekirdag),
            Repo("Item-8",R.drawable.gdgtekirdag)

        )
    }
}