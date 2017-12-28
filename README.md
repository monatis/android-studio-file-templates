# android-studio-file-templates
Make writing common codes more enjoyable

## What is this?

This repository contains file templates to use in Android Studio. Thanks to file templates, you can start with some boilerplate code to build custom and  advanced functionalities more easily.

## Now contains
* RecyclerViewAdapter with OnClickHandler and ViewHolder configured[1]
* Very simple NetworkUtils to make http queries
* PackageManagerUtils to get the SHA1 fingerprint and send it in a custom header for restricted API servers
* PermissionUtils to check if a permission is granted and request it otherwise
* More to come.

## How to set up

* Clone this repository: `git clone https://github.com/monatis/android-studio-file-templates.git`
* Launch Android Studio and open your project.
* Select a source file and then right-click.
* Follow *New -> Edit file templates...* path and then click the plus sign to add a new file template.
* Give a name to your new template (e.g., RecyclerViewAdapter), and paste the contents of a file template from `/android-studio-file-templates/` folder.
* Click OK button.

## How to use

* Select a source directory and right-click.
* From *New* submenu, choose your template.
* Fill in any info that Android Studio might ask for that particular template.
* Complete TODO's if any.

## Contribute

Pull requests are welcome for new templates  and changes in the current templates.

[1]: The template for  RecyclerView adapter is borrowed  from [exercises for Udacity Android Developer Challenge Course](https://github.com/monatis/ud851-Exercises) and updated with new methods and helpful hints.