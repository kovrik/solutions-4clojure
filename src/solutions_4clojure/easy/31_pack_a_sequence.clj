(defn pack [coll]
  (partition-by identity coll))

(= (pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= (pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= (pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
