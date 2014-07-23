; 157 - Indexing Sequences
(defn index [s]
  (map #(vector %1 %2) s (range)))

(= (index [:a :b :c]) [[:a 0] [:b 1] [:c 2]])

(= (index [0 1 3]) '((0 0) (1 1) (3 2)))

(= (index [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])
