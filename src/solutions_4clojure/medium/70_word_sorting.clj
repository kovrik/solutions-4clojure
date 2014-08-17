(defn ws [s]
  (sort-by #(clojure.string/lower-case %) (re-seq #"\w+" s)))


(= (ws  "Have a nice day.")
   ["a" "day" "Have" "nice"])

(= (ws  "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"])

(= (ws  "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])