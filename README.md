---
layout: default
---

## Snapshots of documentation

The current development work and git history of documentation is in the 
`dafny-lang/dafny` repository, in the `docs` folder.

This `dafny-lang/dafny.github.io` repo is the target for `https://dafny.org` 
and is the entry point to all the user-facing documentation about Dafny.

At the top-level is just the index.html landing page, supporting files 
(e.g., images) and files needed for the Github markdown translation.

Sub-folders contain _snapshots_ of the Dafny documentation at the time of 
each release (beginning with 3.9.0). 
Each snapshot is in its own folder, e.g. dafny.org/vX.Y.Z, with `latest` 
containing the most recent, and `dev` redirecting to the development docs.

dafny.org/dafny also resolves to the development docs. In fact, while
dafny.org exists and maps to dafny-lang.github.io (as it currently does),
it appears that if we want the development docs (which are in a different repo) 
to be linked under and subject to the same markdown processing, we need to 
live with the automatically produced dafny.org/dafny mapping for 
dafny-lang/dafny/docs.
