(ns vxe.windex
  (:require
   [me.raynes.conch.low-level]
   [clojure.java.shell])
  (:gen-class))

(defn psh
  ([command]
   (let [c (me.raynes.conch.low-level/proc "powershell" "-command" command)
         output (me.raynes.conch.low-level/stream-to-out c :out)
         error (me.raynes.conch.low-level/stream-to-out c :err)
         ]
     output
     ))
  ([command dir]
   (let [c (me.raynes.conch.low-level/proc "powershell" "-command" command :dir dir)
         output (me.raynes.conch.low-level/stream-to-out c :out )
         error (me.raynes.conch.low-level/stream-to-out c :err)
         ]
     output)
   )
  ([command dir output]
   (let [c (me.raynes.conch.low-level/proc "powershell" "-command" command :dir dir)
         output  (me.raynes.conch.low-level/stream-to-string c :out )
         error (me.raynes.conch.low-level/stream-to-out c :err)
         ]
     output)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
